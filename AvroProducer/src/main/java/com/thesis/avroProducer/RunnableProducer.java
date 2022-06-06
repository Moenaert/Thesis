package com.thesis.avroProducer;

import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.Producer;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class RunnableProducer implements Runnable {

    public String topic;
    public String key;
    public File file;
    public Producer<String, GenericRecord> producer;

    public RunnableProducer(String topicName, String k, File f, Producer<String, GenericRecord> genericProducer){
        this.topic = topicName;
        this.key = k;
        this.file = f;
        this.producer = genericProducer;
    }

    @Override
    public void run() {
        try {
            AvroUtilities avro = new AvroUtilities(file);
            SchemaProcessor schemaProcessor = new SchemaProcessor(topic);
            avro.processRecords(schemaProcessor);
            LinkedList<GenericRecord> records = (LinkedList<GenericRecord>) schemaProcessor.records;
            for(GenericRecord rec: records) {
                if(rec.get("timestamp") == null || rec == null || (long)rec.get("timestamp") == 0){   // messages with timestamp = 0 are invalid
                    continue;
                }
                producer.send(new ProducerRecord<String, GenericRecord>(topic, key, rec));
                System.out.println("topic: " + topic + " key: " + key + " value: " + rec);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
