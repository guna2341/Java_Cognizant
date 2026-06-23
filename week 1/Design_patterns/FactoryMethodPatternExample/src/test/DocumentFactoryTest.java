package test;

import Document.Document;
import Document.Impl.ExcelDocument;
import Document.Impl.PdfDocument;
import Document.Impl.WordDocument;
import Factory.Impl.DocumentFactory;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

public class DocumentFactoryTest {

    private final DocumentFactory factory = new DocumentFactory();

    @Test
    public void shouldCreatePdfDocument() {
        Document document = factory.createDocument("pdf");

        assertNotNull(document);
        assertTrue(document instanceof PdfDocument);
    }

    @Test
    public void shouldCreateWordDocument() {
        Document document = factory.createDocument("word");

        assertNotNull(document);
        assertTrue(document instanceof WordDocument);
    }

    @Test
    public void shouldCreateExcelDocument() {
        Document document = factory.createDocument("excel");

        assertNotNull(document);
        assertTrue(document instanceof ExcelDocument);
    }

    @Test
    public void shouldReturnNullForInvalidDocument() {
        Document document = factory.createDocument("txt");

        assertNull(document);
    }
}