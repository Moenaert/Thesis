package com.thesis.avroProducer;

import org.apache.avro.generic.GenericRecord;

public interface AvroRecordProcessor {

    void processRecord(GenericRecord genericRecord);

}