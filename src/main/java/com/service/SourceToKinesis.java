package com.service;

public interface ReadableSource {
    public List<Record> getRecords();
}

public interface SourceToKinesis {
    public List<PutRecordsRequestEntry> process(ReadableSource source);
}

public class CSVReadableSource implements ReadableSource {
    public List<Record> getRecords() {

    }
}

public class CSVCToKinesis implements SourceToKinesis {
    public void process(ReadableSource source) {

        List<Records> records = source.getRecords();

        for (Record record: records) {

        }
    }
}