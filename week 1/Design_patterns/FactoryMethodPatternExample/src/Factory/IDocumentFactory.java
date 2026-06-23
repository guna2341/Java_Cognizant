package Factory;

import Document.Document;

public abstract class IDocumentFactory {

    public abstract Document createDocument(String documentType);

}
