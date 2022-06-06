package com.thesis.avroConsumer;

import com.thesis.config.AppConfig;
import org.apache.kafka.streams.kstream.Windowed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class AvroConsumer {

    @Autowired
    SimpMessagingTemplate template;

    private long bidPreviousTimestampWindow1 = 0;
    private long bidPreviousTimestampWindow2 = 0;
    private long bidPreviousTimestampWindow3 = 0;
    private long accountPreviousTimestampWindow1 = 0;
    private long accountPreviousTimestampWindow2 = 0;
    private long accountPreviousTimestampWindow3 = 0;
    private long viewPreviousTimestampWindow1 = 0;
    private long viewPreviousTimestampWindow2 = 0;
    private long viewPreviousTimestampWindow3 = 0;

    private void processMessage(long previousTimestamp, long nextTimestamp, int timestampInterval_ms, String windowTopic,Windowed<String> receivedKey, Long receivedValue, int waitTime_ms  ) throws InterruptedException {
        for(long timestamp = previousTimestamp + timestampInterval_ms; timestamp<= nextTimestamp; timestamp = timestamp + timestampInterval_ms) {
            if(timestamp != nextTimestamp) {
                template.convertAndSend("/topic/" + windowTopic, new Message(timestamp, 0L));
            }
            else {
                template.convertAndSend("/topic/" + windowTopic, new Message(receivedKey.window().end(), receivedValue));
            }
            Thread.sleep(waitTime_ms);
        }
    }

    @KafkaListener(topics = AppConfig.bids_window_1_topic, groupId = AppConfig.bids_window_1_topic, containerFactory = "kafkaListenerContainerFactory_window_1")
    public void bids_window_1_consumer(@Payload Long value,
                          @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) Windowed<String> key) throws InterruptedException {
        long nextTimestamp = key.window().end();
        if( bidPreviousTimestampWindow1 == 0) {
            template.convertAndSend("/topic/" + AppConfig.bids_window_1_topic, new Message(key.window().end(), value));
            bidPreviousTimestampWindow1 = nextTimestamp;
            return;
        }
        processMessage(bidPreviousTimestampWindow1, nextTimestamp,1000*60*15, AppConfig.bids_window_1_topic, key, value,100);
        bidPreviousTimestampWindow1 = nextTimestamp;
    }

    @KafkaListener(topics = AppConfig.bids_window_2_topic, groupId = AppConfig.bids_window_2_topic, containerFactory = "kafkaListenerContainerFactory_window_2")
    public void bids_window_2_consumer(@Payload Long value,
                          @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) Windowed<String> key) throws InterruptedException {
        long nextTimestamp = key.window().end();
        if( bidPreviousTimestampWindow2 == 0) {
            template.convertAndSend("/topic/" + AppConfig.bids_window_2_topic, new Message(key.window().end(), value));
            bidPreviousTimestampWindow2 = nextTimestamp;
            return;
        }
        processMessage(bidPreviousTimestampWindow2, nextTimestamp,1000*60*60, AppConfig.bids_window_2_topic, key, value,400);
        bidPreviousTimestampWindow2 = nextTimestamp;
    }

    @KafkaListener(topics = AppConfig.bids_window_3_topic, groupId = AppConfig.bids_window_3_topic, containerFactory = "kafkaListenerContainerFactory_window_3")
    public void bids_window_3_consumer(@Payload Long value,
                         @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) Windowed<String> key) throws InterruptedException {
        long nextTimestamp = key.window().end();
        if( bidPreviousTimestampWindow3 == 0) {
            template.convertAndSend("/topic/" + AppConfig.bids_window_3_topic, new Message(key.window().end(), value));
            bidPreviousTimestampWindow3 = nextTimestamp;
            return;
        }
        processMessage(bidPreviousTimestampWindow3, nextTimestamp,1000*60*60*24, AppConfig.bids_window_3_topic, key, value,9600);
        bidPreviousTimestampWindow3 = nextTimestamp;
    }

    @KafkaListener(topics = AppConfig.accounts_window_1_topic, groupId = AppConfig.accounts_window_1_topic, containerFactory = "kafkaListenerContainerFactory_window_1")
    public void accounts_window_1_consumer(@Payload Long value,
                          @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) Windowed<String> key) throws InterruptedException {
        long nextTimestamp = key.window().end();
        if( accountPreviousTimestampWindow1 == 0) {
            template.convertAndSend("/topic/" + AppConfig.accounts_window_1_topic, new Message(key.window().end(), value));
            accountPreviousTimestampWindow1 = nextTimestamp;
            return;
        }
        processMessage(accountPreviousTimestampWindow1, nextTimestamp, 1000*60*15, AppConfig.accounts_window_1_topic, key, value,100);
        accountPreviousTimestampWindow1 = nextTimestamp;
    }

    @KafkaListener(topics = AppConfig.accounts_window_2_topic, groupId = AppConfig.accounts_window_2_topic, containerFactory = "kafkaListenerContainerFactory_window_2")
    public void accounts_window_2_consumer(@Payload Long value,
                          @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) Windowed<String> key) throws InterruptedException {
        long nextTimestamp = key.window().end();
        if( accountPreviousTimestampWindow2 == 0) {
            template.convertAndSend("/topic/" + AppConfig.accounts_window_2_topic, new Message(key.window().end(), value));
            accountPreviousTimestampWindow2 = nextTimestamp;
            return;
        }
        processMessage(accountPreviousTimestampWindow2, nextTimestamp, 1000*60*60, AppConfig.accounts_window_2_topic, key, value,400);
        accountPreviousTimestampWindow2 = nextTimestamp;
    }

    @KafkaListener(topics = AppConfig.accounts_window_3_topic, groupId = AppConfig.accounts_window_3_topic, containerFactory = "kafkaListenerContainerFactory_window_3")
    public void accounts_window_3_consumer(@Payload Long value,
                         @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) Windowed<String> key) throws InterruptedException {
        long nextTimestamp = key.window().end();
        if( accountPreviousTimestampWindow3 == 0) {
            template.convertAndSend("/topic/" + AppConfig.accounts_window_3_topic, new Message(key.window().end(), value));
            accountPreviousTimestampWindow3 = nextTimestamp;
            return;
        }
        processMessage(accountPreviousTimestampWindow3, nextTimestamp, 1000*60*60*24, AppConfig.accounts_window_3_topic, key, value,9600);
        accountPreviousTimestampWindow3 = nextTimestamp;
    }

    @KafkaListener(topics = AppConfig.views_window_1_topic, groupId = AppConfig.views_window_1_topic, containerFactory = "kafkaListenerContainerFactory_window_1")
    public void views_window_1_consumer(@Payload Long value,
                                           @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) Windowed<String> key) throws InterruptedException {
        long nextTimestamp = key.window().end();
        if( viewPreviousTimestampWindow1 == 0) {
            template.convertAndSend("/topic/" + AppConfig.views_window_1_topic, new Message(key.window().end(), value));
            viewPreviousTimestampWindow1 = nextTimestamp;
            return;
        }
        processMessage(viewPreviousTimestampWindow1, nextTimestamp, 1000*60*15, AppConfig.views_window_1_topic, key, value,100);
        viewPreviousTimestampWindow1 = nextTimestamp;
    }

    @KafkaListener(topics = AppConfig.views_window_2_topic, groupId = AppConfig.views_window_2_topic, containerFactory = "kafkaListenerContainerFactory_window_2")
    public void views_window_2_consumer(@Payload Long value,
                                           @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) Windowed<String> key) throws InterruptedException {
        long nextTimestamp = key.window().end();
        if( viewPreviousTimestampWindow2 == 0) {
            template.convertAndSend("/topic/" + AppConfig.views_window_2_topic, new Message(key.window().end(), value));
            viewPreviousTimestampWindow2 = nextTimestamp;
            return;
        }
        processMessage(viewPreviousTimestampWindow2, nextTimestamp, 1000*60*60, AppConfig.views_window_2_topic, key, value,400);
        viewPreviousTimestampWindow2 = nextTimestamp;
    }

    @KafkaListener(topics = AppConfig.views_window_3_topic, groupId = AppConfig.views_window_3_topic, containerFactory = "kafkaListenerContainerFactory_window_3")
    public void views_window_3_consumer(@Payload Long value,
                                           @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) Windowed<String> key) throws InterruptedException {
        long nextTimestamp = key.window().end();
        if( viewPreviousTimestampWindow3 == 0) {
            template.convertAndSend("/topic/" + AppConfig.views_window_3_topic, new Message(key.window().end(), value));
            viewPreviousTimestampWindow3 = nextTimestamp;
            return;
        }
        processMessage(viewPreviousTimestampWindow3, nextTimestamp, 1000*60*60*24, AppConfig.views_window_3_topic, key, value,9600);
        viewPreviousTimestampWindow3 = nextTimestamp;
    }

}
