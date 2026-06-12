package Document.Impl;

import Document.Document;

public class WordDocument implements Document {
    @Override
    public void create() {
        System.out.println("Word document created.");
    }

    @Override
    public void open() {
        System.out.println("Word document opened.");
    }

    @Override
    public void save() {
        System.out.println("Word document saved.");
    }
}
