package com.thesis.config;

import avro_generated_types.Account;
import avro_generated_types.Bid;
import avro_generated_types.View;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.apache.kafka.streams.kstream.*;
import org.springframework.cloud.stream.schema.client.ConfluentSchemaRegistryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

@Configuration
public class AppSerdes {

    @Bean
    public ConfluentSchemaRegistryClient schemaRegistryClient(){
        ConfluentSchemaRegistryClient client = new ConfluentSchemaRegistryClient();
        client.setEndpoint(AppConfig.schemaRegistryServers);
        return client;
    }

    @Bean
    public static Serde<Bid> bidSerde() {
        Serde<Bid> serde = new SpecificAvroSerde<>();
        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put("schema.registry.url", AppConfig.schemaRegistryServers);
        serde.configure(serdeConfigs, false);
        return serde;
    }

    @Bean
    public static Serde<Account> accountSerde() {
        Serde<Account> serde = new SpecificAvroSerde<>();
        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put("schema.registry.url", AppConfig.schemaRegistryServers);
        serde.configure(serdeConfigs, false);
        return serde;
    }

    @Bean
    public static Serde<View> viewSerde() {
        Serde<View> serde = new SpecificAvroSerde<>();
        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put("schema.registry.url", AppConfig.schemaRegistryServers);
        serde.configure(serdeConfigs, false);
        return serde;
    }

    @Bean
    public static Serde<Windowed<String>> windowSerdes_window_1() {
        StringSerializer stringSerializer = new StringSerializer();
        StringDeserializer stringDeserializer = new StringDeserializer();
        Serde<String> stringSerde = Serdes.serdeFrom(stringSerializer,stringDeserializer);
        TimeWindowedSerializer<String> windowedSerializer = new TimeWindowedSerializer<>(stringSerializer);
        TimeWindowedDeserializer<String> windowedDeserializer = new TimeWindowedDeserializer<>(stringDeserializer, (long)AppConfig.window_1_duration_ms);
        Serde<Windowed<String>> windowSerde = Serdes.serdeFrom(windowedSerializer,windowedDeserializer);
        return windowSerde;
    }

    @Bean
    public static Serde<Windowed<String>> windowSerdes_window_2() {
        StringSerializer stringSerializer = new StringSerializer();
        StringDeserializer stringDeserializer = new StringDeserializer();
        Serde<String> stringSerde = Serdes.serdeFrom(stringSerializer,stringDeserializer);
        TimeWindowedSerializer<String> windowedSerializer = new TimeWindowedSerializer<>(stringSerializer);
        TimeWindowedDeserializer<String> windowedDeserializer = new TimeWindowedDeserializer<>(stringDeserializer, (long)AppConfig.window_2_duration_ms);
        Serde<Windowed<String>> windowSerde = Serdes.serdeFrom(windowedSerializer,windowedDeserializer);
        return windowSerde;
    }

    @Bean
    public static Serde<Windowed<String>> windowSerdes_window_3() {
        StringSerializer stringSerializer = new StringSerializer();
        StringDeserializer stringDeserializer = new StringDeserializer();
        Serde<String> stringSerde = Serdes.serdeFrom(stringSerializer,stringDeserializer);
        TimeWindowedSerializer<String> windowedSerializer = new TimeWindowedSerializer<>(stringSerializer);
        TimeWindowedDeserializer<String> windowedDeserializer = new TimeWindowedDeserializer<>(stringDeserializer, (long)AppConfig.window_3_duration_ms);
        Serde<Windowed<String>> windowSerde = Serdes.serdeFrom(windowedSerializer,windowedDeserializer);
        return windowSerde;
    }
}













