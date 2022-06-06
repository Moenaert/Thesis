package com.thesis.avroProducer;

import com.thesis.config.AppConfig;
import org.apache.avro.generic.GenericRecord;

import java.util.LinkedList;
import java.util.List;


public class SchemaProcessor implements AvroRecordProcessor {
    public String topicName;
    public List<GenericRecord> records = new LinkedList<GenericRecord>();

    public SchemaProcessor(String topicName) {
        this.topicName = topicName;
    }

    @Override
    public void processRecord(GenericRecord record) {
        GenericRecord rec = null;
        switch (topicName){
            case AppConfig.accountTopic:
                rec = new RecordBuilder().build_account(record);
                break;
            case AppConfig.bidTopic:
                rec = new RecordBuilder().build_bid(record);
                break;
            case AppConfig.viewTopic:
                rec = new RecordBuilder().build_view(record);
                break;
        }
        records.add(rec);
    }
}

