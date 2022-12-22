package org.example.decorator;

public class CashedDocument implements Document {

    private final Document document;
    private String cashe;

    public CashedDocument(Document document) {
        this.document = document;
    }
    
    @Override
    public String parse() {
        this.cashe = document.parse();
        return cashe;
    }
}
