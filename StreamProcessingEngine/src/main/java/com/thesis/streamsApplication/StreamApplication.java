package com.thesis.streamsApplication;

import com.thesis.config.AppConfig;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Properties;

public class StreamApplication {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

            final Properties props = new Properties();
            props.put(StreamsConfig.APPLICATION_ID_CONFIG, AppConfig.application_id_config);
            props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, AppConfig.bootstrapServers);
            props.put(StreamsConfig.COMMIT_INTERVAL_MS_CONFIG, 0); //commit as soon as possible
            props.put(StreamsConfig.STATE_DIR_CONFIG, "state-store");
            props.put(StreamsConfig.NUM_STREAM_THREADS_CONFIG, AppConfig.numberOfTopicPartitions);

            StreamsBuilder streamsBuilder = new StreamsBuilder();

            BidTopology.withBuilder(streamsBuilder);
            AccountTopology.withBuilder(streamsBuilder);
            ViewTopology.withBuilder(streamsBuilder);

            KafkaStreams streams = new KafkaStreams(streamsBuilder.build(), props);
            streams.start();

            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                logger.info("Stopping Stream");
                streams.close();
            }));
    }
}

