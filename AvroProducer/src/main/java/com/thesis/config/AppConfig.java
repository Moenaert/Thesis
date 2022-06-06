package com.thesis.config;

import io.confluent.kafka.serializers.KafkaAvroSerializer;

public class AppConfig {

    public final static String bootstrapServers = "https://localhost:19091";
    public final static int numberOfProducers = 3;
    public final static String acknowledgements = "all";
    public final static String retries = "0";

    public final static String key_serializer = "org.apache.kafka.common.serialization.StringSerializer";
    public final static Class<KafkaAvroSerializer> value_serializer = KafkaAvroSerializer.class;
    public final static String schemaRegistryServers = "http://localhost:8081";

    public final static String bidTopic = "bids";
    public final static String accountTopic ="accounts";
    public final static String viewTopic = "views";

    public final static String bid_entity_avro = "./AvroProducer/src/main/resources/avro/records/acc_dashboard_bid_entity_ordered.avro";
    public final static String account_entity_avro = "./AvroProducer/src/main/resources/avro/records/acc_platform_account_entity_ordered.avro";
    public final static String view_entity_avro = "./AvroProducer/src/main/resources/avro/records/acc_dashboard_interactiveSale_entity_ordered.avro";
}
