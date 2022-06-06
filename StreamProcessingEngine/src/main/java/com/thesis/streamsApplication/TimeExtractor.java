package com.thesis.streamsApplication;

import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.streams.processor.TimestampExtractor;

import java.time.Instant;
import java.util.Objects;

public class TimeExtractor implements TimestampExtractor {
    @Override
    public long extract(ConsumerRecord<Object, Object> consumerRecord, long prevTime) {
        GenericRecord record = (GenericRecord) consumerRecord.value();
        if(Objects.isNull(record.get("timestamp")))  // If creation time == null --> creationTime = 0 = Unknown
            return 0;
        long eventTime = Instant.ofEpochMilli((long) ((long) (record.get("timestamp")) * 0.001)).toEpochMilli();
        return ((eventTime>0) ? eventTime : prevTime);  // if eventTime is negative return timestamp of previous message
    }
}
