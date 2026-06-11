package Factory.Impl;

import Document.Document;
import Document.Impl.WordDocument;
import Factory.DocumentFactory;

public class WordDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new WordDocument();
    }

}
