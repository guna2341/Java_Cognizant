import Document.Document;
import Document.Impl.ExcelDocument;
import Document.Impl.PdfDocument;
import Document.Impl.WordDocument;
import Factory.DocumentFactory;
import Factory.Impl.ExcelDocumentFactory;
import Factory.Impl.PdfDocumentFactory;
import Factory.Impl.WordDocumentFactory;

public class Main {
    public static void main(String[] args) {
//        Check for Word document
        DocumentFactory wordDocumentFactory = new WordDocumentFactory();
        Document wordDocument = wordDocumentFactory.createDocument();
        System.out.println(wordDocument instanceof WordDocument);

//        Check for Pdf document
        DocumentFactory pdfDocumentFactory = new PdfDocumentFactory();
        Document pdfDocument = pdfDocumentFactory.createDocument();
        System.out.println(pdfDocument instanceof PdfDocument);

//        Check for Excel document
        DocumentFactory excelDocumentFactory = new ExcelDocumentFactory();
        Document excelDocument = excelDocumentFactory.createDocument();
        System.out.println(excelDocument instanceof ExcelDocument);
    }
}