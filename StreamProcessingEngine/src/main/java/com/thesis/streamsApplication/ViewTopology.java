package com.thesis.streamsApplication;

import avro_generated_types.View;
import com.thesis.config.AppConfig;
import com.thesis.config.AppSerdes;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.*;
import java.time.Duration;
import static org.apache.kafka.streams.kstream.Suppressed.BufferConfig.unbounded;

public class ViewTopology {

    static void withBuilder(StreamsBuilder streamsBuilder){
        // KSV0 = Views source stream-----------------------------------------------------------------------------------
        KGroupedStream<String, View> KSV0 = streamsBuilder
                .stream(AppConfig.viewTopic, Consumed.with(Serdes.String(), AppSerdes.viewSerde()).withTimestampExtractor(new TimeExtractor()))
                .groupByKey(Grouped.with(Serdes.String(),AppSerdes.viewSerde()));

        // KTV1 = views window_1 aggregate
        KTable<Windowed<String>, Long> KTV1 = KSV0.windowedBy(TimeWindows.ofSizeAndGrace(Duration.ofMillis(AppConfig.window_1_duration_ms), Duration.ofMinutes(0)))
                .count(Materialized.as("views_store_window_1"))
                .suppress(Suppressed.untilWindowCloses(unbounded()));
        KTV1.toStream().to(AppConfig.views_window_1_topic);

        // KTV2 = views window_2 aggregate
        KTable<Windowed<String>, Long> KTV2 = KSV0.windowedBy(TimeWindows.ofSizeAndGrace(Duration.ofMillis(AppConfig.window_2_duration_ms), Duration.ofMinutes(0)))
                .count(Materialized.as("views_store_window_2"))
                .suppress(Suppressed.untilWindowCloses(unbounded()));
        KTV2.toStream().to(AppConfig.views_window_2_topic);

        // KTA3 = views window_3 aggregate
        KTable<Windowed<String>, Long> KTV3 = KSV0.windowedBy(TimeWindows.ofSizeAndGrace(Duration.ofMillis(AppConfig.window_3_duration_ms), Duration.ofMinutes(0)))
                .count(Materialized.as("views_store_window_3"))
                .suppress(Suppressed.untilWindowCloses(unbounded()));
        KTV3.toStream().to(AppConfig.views_window_3_topic);
    }
}
