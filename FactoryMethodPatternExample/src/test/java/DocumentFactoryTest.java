package test.java;

import Document.Document;
import Document.Impl.ExcelDocument;
import Document.Impl.PdfDocument;
import Document.Impl.WordDocument;
import Factory.DocumentFactory;
import Factory.Impl.ExcelDocumentFactory;
import Factory.Impl.PdfDocumentFactory;
import Factory.Impl.WordDocumentFactory;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class DocumentFactoryTest {

    @Test
    public void wordDocumentFactoryTest() {
        DocumentFactory wordDocumentFactory = new WordDocumentFactory();
        Document wordDocument = wordDocumentFactory.createDocument();
        assertNotNull(wordDocument);
        assertTrue(wordDocument instanceof WordDocument);
    }

    @Test
    public void pdfDocumentFactoryTest() {
        DocumentFactory pdfDocumentFactory = new PdfDocumentFactory();
        Document pdfDocument = pdfDocumentFactory.createDocument();
        assertNotNull(pdfDocument);
        assertTrue(pdfDocument instanceof PdfDocument);
    }

    @Test
    public void excelDocumentFactoryTest() {
        DocumentFactory excelDocumentFactory = new ExcelDocumentFactory();
        Document excelDocument = excelDocumentFactory.createDocument();
        assertNotNull(excelDocument);
        assertTrue(excelDocument instanceof ExcelDocument);
    }
}