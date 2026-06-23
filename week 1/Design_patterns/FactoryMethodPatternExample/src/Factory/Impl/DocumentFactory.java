package Factory.Impl;

import Document.Document;
import Document.Impl.ExcelDocument;
import Document.Impl.PdfDocument;
import Document.Impl.WordDocument;
import Factory.IDocumentFactory;

import java.util.HashMap;

public class DocumentFactory extends IDocumentFactory {



    @Override
    public Document createDocument(String documentType) {
        return switch (documentType.toUpperCase()) {
            case "PDF" -> new PdfDocument();
            case "EXCEL" -> new ExcelDocument();
            case "WORD" -> new WordDocument();
            default -> null;
        };
    }
}
