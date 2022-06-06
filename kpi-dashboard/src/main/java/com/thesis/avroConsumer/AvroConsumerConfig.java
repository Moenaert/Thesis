package com.thesis.avroConsumer;

import com.thesis.config.AppConfig;
import com.thesis.config.AppSerdes;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.kstream.Windowed;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import java.util.HashMap;
import java.util.Map;

@EnableKafka
@Configuration
public class AvroConsumerConfig {

    @Bean
    public ConsumerFactory<Windowed<String>, Long> consumerConfig_window_1() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, AppConfig.bootstrapServers);
        props.put(ConsumerConfig.MAX_POLL_INTERVAL_MS_CONFIG, 1800000);
        return new DefaultKafkaConsumerFactory<>(props, AppSerdes.windowSerdes_window_1().deserializer(), Serdes.Long().deserializer());
    }

    @Bean 
    public ConcurrentKafkaListenerContainerFactory<Windowed<String>, Long> kafkaListenerContainerFactory_window_1() {
        ConcurrentKafkaListenerContainerFactory<Windowed<String>, Long> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerConfig_window_1());
        return factory;
    }

    @Bean
    public ConsumerFactory<Windowed<String>, Long> consumerConfig_window_2() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, AppConfig.bootstrapServers);
        props.put(ConsumerConfig.MAX_POLL_INTERVAL_MS_CONFIG, 1800000);
        return new DefaultKafkaConsumerFactory<>(props, AppSerdes.windowSerdes_window_2().deserializer(), Serdes.Long().deserializer());
    }


    @Bean
    public ConcurrentKafkaListenerContainerFactory<Windowed<String>, Long> kafkaListenerContainerFactory_window_2() {
        ConcurrentKafkaListenerContainerFactory<Windowed<String>, Long> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerConfig_window_2());
        return factory;
    }

    @Bean
    public ConsumerFactory<Windowed<String>, Long> consumerConfig_window_3() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, AppConfig.bootstrapServers);
        props.put(ConsumerConfig.MAX_POLL_INTERVAL_MS_CONFIG, 1800000);
        return new DefaultKafkaConsumerFactory<>(props, AppSerdes.windowSerdes_window_3().deserializer(), Serdes.Long().deserializer());
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<Windowed<String>, Long> kafkaListenerContainerFactory_window_3() {
        ConcurrentKafkaListenerContainerFactory<Windowed<String>, Long> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerConfig_window_3());
        return factory;
    }

}
