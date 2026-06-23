import Document.Document;
import Document.Impl.ExcelDocument;
import Document.Impl.PdfDocument;
import Document.Impl.WordDocument;
import Factory.Impl.DocumentFactory;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        DocumentFactory documentFactory = new DocumentFactory();
        Document pdf = documentFactory.createDocument("pdf");
        pdf.create();
        Document word = documentFactory.createDocument("word");
        word.create();
        Document excel = documentFactory.createDocument("excel");
        excel.create();
        Stack<Integer> stack = new Stack<>();
    }
}