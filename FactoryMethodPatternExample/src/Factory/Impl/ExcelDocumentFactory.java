package Factory.Impl;

import Document.Document;
import Document.Impl.ExcelDocument;
import Factory.DocumentFactory;

public class ExcelDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
