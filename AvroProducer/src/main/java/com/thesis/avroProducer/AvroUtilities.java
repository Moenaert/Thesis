package com.thesis.avroProducer;

import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;

import java.io.File;
import java.io.IOException;

public class AvroUtilities {
    public File file;

    public AvroUtilities(File f) {
        file = f;
    }

    public static Schema getSchema(File file) throws IOException {
        DatumReader<GenericRecord> reader = new GenericDatumReader<GenericRecord>();
        DataFileReader<GenericRecord> fileReader = new DataFileReader<GenericRecord>(file, reader);
        return fileReader.getSchema();
    }

    public void processRecords(AvroRecordProcessor processor) throws IOException {
        DatumReader<GenericRecord> reader = new GenericDatumReader<GenericRecord>();
        DataFileReader<GenericRecord> fileReader = new DataFileReader<>(file, reader);

        Schema schema = fileReader.getSchema();
        GenericRecord record = new GenericData.Record(schema);

        while(fileReader.hasNext()) {
            fileReader.next(record);
            processor.processRecord(record);
        }
    }
}
