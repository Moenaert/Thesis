package com.thesis.config;

import io.confluent.kafka.serializers.KafkaAvroSerializer;

public class AppConfig {
    public final static String emailHost = "smtp.gmail.com";
    public final static String emailAdress = "bastien.moenaert@gmail.com";
    public final static String emailPassword = "kekzkudnkvxhyeso";
    public final static int Threshold = 200;

    public final static String application_id_config = "thesis";
    public final static String bootstrapServers = "kafka-1:9091";
    public final static int numberOfProducers = 3;
    public final static int numberOfTopicPartitions = 3;
    public final static String acknowledgements = "all";
    public final static String retries = "0";
    public final static String key_serializer = "org.apache.kafka.common.serialization.StringSerializer";
    public final static Class<KafkaAvroSerializer> value_serializer = KafkaAvroSerializer.class;
    public final static String schemaRegistryServers = "http://schema-registry:8081";
    public final static int window_1_duration_ms = 1000*60*15;
    public final static int window_2_duration_ms = 1000*60*60;
    public final static int window_3_duration_ms = 1000*60*60*24;
    public final static String bidTopic = "bids";
    public final static String bids_window_1_topic = "bids_window_1_topic";
    public final static String bids_window_2_topic = "bids_window_2_topic";
    public final static String bids_window_3_topic = "bids_window_3_topic";
    public final static String bids_consumer_group = "bids_consumer_group";
    public final static String accountTopic ="accounts";
    public final static String accounts_window_1_topic = "accounts_window_1_topic";
    public final static String accounts_window_2_topic = "accounts_window_2_topic";
    public final static String accounts_window_3_topic = "accounts_window_3_topic";
    public final static String accounts_consumer_group = "accounts_consumer_group";
    public final static String viewTopic = "views";
    public final static String views_window_1_topic = "views_window_1_topic";
    public final static String views_window_2_topic = "views_window_2_topic";
    public final static String views_window_3_topic = "views_window_3_topic";
    public final static String views_consumer_group = "views_consumer_group";


    public final static String bid_entity_avro = "./src/main/resources/avro/records/acc_dashboard_bid_entity_ordered.avro";
    public final static String account_entity_avro = "./src/main/resources/avro/records/acc_platform_account_entity_ordered.avro";
    public final static String view_entity_avro = "./src/main/resources/avro/records/acc_dashboard_interactiveSale_entity_ordered.avro";
}
