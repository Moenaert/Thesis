package com.thesis.streamsApplication;

import avro_generated_types.Account;
import com.thesis.config.AppConfig;
import com.thesis.config.AppSerdes;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.*;

import java.time.Duration;

import static org.apache.kafka.streams.kstream.Suppressed.BufferConfig.unbounded;

public class AccountTopology {

    static void withBuilder(StreamsBuilder streamsBuilder){

        // KSA0 = accounts source stream--------------------------------------------------------------------------------
        KGroupedStream<String, Account> KSA0 = streamsBuilder
                .stream(AppConfig.accountTopic, Consumed.with(Serdes.String(), AppSerdes.accountSerde()).withTimestampExtractor(new TimeExtractor()))
                .filter((k,v)->v.getDeleted$1().equals(false))
                .groupByKey(Grouped.with(Serdes.String(),AppSerdes.accountSerde()));

        // KTA1 = accounts window_1 aggregate
        KTable<Windowed<String>, Long> KTA1 = KSA0.windowedBy(TimeWindows.ofSizeAndGrace(Duration.ofMillis(AppConfig.window_1_duration_ms), Duration.ofMinutes(0)))
                .count(Materialized.as("accounts_store_window_1"))
                .suppress(Suppressed.untilWindowCloses(unbounded()));
        KTA1.toStream().to(AppConfig.accounts_window_1_topic);

        // KTA2 = accounts window_2 aggregate
        KTable<Windowed<String>, Long> KTA2 = KSA0.windowedBy(TimeWindows.ofSizeAndGrace(Duration.ofMillis(AppConfig.window_2_duration_ms), Duration.ofMinutes(0)))
                .count(Materialized.as("accounts_store_window_2"))
                .suppress(Suppressed.untilWindowCloses(unbounded()));
        KTA2.toStream().to(AppConfig.accounts_window_2_topic);

        // KTA3 = accounts window_3 aggregate
        KTable<Windowed<String>, Long> KTA3 = KSA0.windowedBy(TimeWindows.ofSizeAndGrace(Duration.ofMillis(AppConfig.window_3_duration_ms), Duration.ofMinutes(0)))
                .count(Materialized.as("accounts_store_window_3"))
                .suppress(Suppressed.untilWindowCloses(unbounded()));
        KTA3.toStream().to(AppConfig.accounts_window_3_topic);

    }
}
