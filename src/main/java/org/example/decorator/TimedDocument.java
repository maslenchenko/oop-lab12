package org.example.decorator;

public class TimedDocument implements Document{

    private final Document document;

    public TimedDocument(Document document) {
        this.document = document;
    }

    @Override
    public String parse() {
        long startTime = System.nanoTime();
        String parsed = document.parse();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        return parsed;
    }
}
