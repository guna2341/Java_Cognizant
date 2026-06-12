package Document.Impl;

import Document.Document;

public class ExcelDocument implements Document {
    @Override
    public void create() {
        System.out.println("Excel document created.");
    }

    @Override
    public void open() {
        System.out.println("Excel document created.");
    }

    @Override
    public void save() {
        System.out.println("Excel document created.");
    }
}
