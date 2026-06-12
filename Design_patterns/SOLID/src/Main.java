import implementations.SQL;
import implementations.StudentInput;
import implementations.StudentPrinter;
import interfaces.Database;
import model.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        StudentInput studentInput = new StudentInput();
        Student student = studentInput.createStudent();
        StudentPrinter printer = new StudentPrinter();
        printer.reportStudent(student);
        Database db = new SQL();
        student.saveToDb(db);
    }
}