package Factory.Impl;

import Document.Document;
import Document.Impl.PdfDocument;
import Factory.DocumentFactory;


public class PdfDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new PdfDocument();
    }

}
