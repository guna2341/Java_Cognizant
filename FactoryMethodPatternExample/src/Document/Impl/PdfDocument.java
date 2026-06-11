package Document.Impl;

import Document.Document;

public class PdfDocument implements Document {
    @Override
    public void create() {
        System.out.println("Pdf document created.");
    }

    @Override
    public void open() {
        System.out.println("Pdf document created.");
    }

    @Override
    public void save() {
        System.out.println("Pdf document created.");
    }
}
