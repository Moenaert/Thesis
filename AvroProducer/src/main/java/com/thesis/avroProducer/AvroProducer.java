package com.thesis.avroProducer;

import com.thesis.config.AppConfig;
import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig;
import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;

import java.io.File;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class AvroProducer {

    public static void main(String[] args) {
        int noOfProducers = AppConfig.numberOfProducers;
        ExecutorService executor = Executors.newFixedThreadPool(noOfProducers);
        final Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, AppConfig.bootstrapServers);
        props.put(ProducerConfig.ACKS_CONFIG, AppConfig.acknowledgements);
        props.put(ProducerConfig.RETRIES_CONFIG, AppConfig.retries);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, AppConfig.key_serializer);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, AppConfig.value_serializer);
        props.put(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, AppConfig.schemaRegistryServers);

        /*
        for(int i =1; i<=noOfProducers/3; i++) {
            Producer<String, GenericRecord> producer = new KafkaProducer<>(props);
            RunnableProducer bidProducer = new RunnableProducer(AppConfig.bidTopic, "window_" + i, new File(AppConfig.bid_entity_avro), producer);
            runnableProducers.add(bidProducer);
            executor.submit(bidProducer);
        }

        for(int i =1; i<=noOfProducers/3; i++) {
            Producer<String, GenericRecord> producer = new KafkaProducer<>(props);
            RunnableProducer accountProducer = new RunnableProducer(AppConfig.accountTopic, "window_" + i, new File(AppConfig.account_entity_avro), producer);
            runnableProducers.add(accountProducer);
            executor.submit(accountProducer);
        }

        for(int i =1; i<=noOfProducers/3; i++) {
            Producer<String, GenericRecord> producer = new KafkaProducer<>(props);
            RunnableProducer viewProducer = new RunnableProducer(AppConfig.viewTopic, "window_" + i, new File(AppConfig.view_entity_avro), producer);
            runnableProducers.add(viewProducer);
            executor.submit(viewProducer);
        }

         */

        Producer<String, GenericRecord> producer1 = new KafkaProducer<>(props);
        Producer<String, GenericRecord> producer2 = new KafkaProducer<>(props);
        Producer<String, GenericRecord> producer3 = new KafkaProducer<>(props);

        RunnableProducer bidProducer = new RunnableProducer(AppConfig.bidTopic, "bids", new File(AppConfig.bid_entity_avro), producer1);
        executor.submit(bidProducer);
        RunnableProducer accountProducer = new RunnableProducer(AppConfig.accountTopic, "accounts", new File(AppConfig.account_entity_avro), producer2);
        executor.submit(accountProducer);
        RunnableProducer viewProducer = new RunnableProducer(AppConfig.viewTopic, "views", new File(AppConfig.view_entity_avro), producer3);
        executor.submit(viewProducer);
    }
}
