package com.thesis.streamsApplication;

import avro_generated_types.Bid;
import com.thesis.config.AppConfig;
import com.thesis.config.AppSerdes;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.*;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import static org.apache.kafka.streams.kstream.Suppressed.BufferConfig.unbounded;

public class BidTopology {

    static void withBuilder(StreamsBuilder streamsBuilder){

        SimpleDateFormat DateFor1 = new SimpleDateFormat("MMMM dd");
        SimpleDateFormat DateFor2 = new SimpleDateFormat("HH:mm");
        SimpleDateFormat DateFor3 = new SimpleDateFormat("HH:mm");

        // KSB0 = Bids source stream------------------------------------------------------------------------------------
        KGroupedStream<String, Bid> KSB0 = streamsBuilder
                .stream(AppConfig.bidTopic, Consumed.with(Serdes.String(), AppSerdes.bidSerde()).withTimestampExtractor(new TimeExtractor()))
                .filter((k,v)->v.getDeleted$1().equals(false))
                .filter((k,v)->v.getRefused().equals(false))
                .groupByKey(Grouped.with(Serdes.String(),AppSerdes.bidSerde()));

        // KTB1 = bids window_1 aggregate
        KStream<Windowed<String>, Long> KSB1 = KSB0.windowedBy(TimeWindows.ofSizeAndGrace(Duration.ofMillis(AppConfig.window_1_duration_ms), Duration.ofMinutes(0)))
                .count(Materialized.as("bids_store_window_1"))
                .suppress(Suppressed.untilWindowCloses(unbounded()))
                .toStream()
                .peek((k,v)-> {
                    if (v > AppConfig.Threshold) {
                        Date startDate = new Date(k.window().start());
                        String stringDateStart1 = DateFor1.format(startDate);
                        String stringDateStart2 = DateFor2.format(startDate);
                        Date endDate = new Date(k.window().end());
                        String stringDateEnd = DateFor3.format(endDate);
                        SimpleEmail.send(AppConfig.emailAdress, AppConfig.emailPassword, "bastien.moenaert@gmail.com","KPI dashboard notification",
                                "The total number of bids on Biddit was particularly high between "+ stringDateStart1 + ", " + stringDateStart2 + " - "+ stringDateEnd + ". The number of bids during this period was "+ v+".");
                    }
                });
        KSB1.to(AppConfig.bids_window_1_topic);

        // KTB2 = bids window_2 aggregate
        KTable<Windowed<String>, Long> KTB2 = KSB0.windowedBy(TimeWindows.ofSizeAndGrace(Duration.ofMillis(AppConfig.window_2_duration_ms), Duration.ofMinutes(0)))
                .count(Materialized.as("bids_store_window_2"))
                .suppress(Suppressed.untilWindowCloses(unbounded()));
        KTB2.toStream().to(AppConfig.bids_window_2_topic);

        //KTB3 = bids window_3 aggregate
        KTable<Windowed<String>, Long> KTB3 = KSB0.windowedBy(TimeWindows.ofSizeAndGrace(Duration.ofMillis(AppConfig.window_3_duration_ms), Duration.ofMinutes(0)))
                .count(Materialized.as("bids_store_window_3"))
                .suppress(Suppressed.untilWindowCloses(unbounded()));
        KTB3.toStream().to(AppConfig.bids_window_3_topic);
    }
}
