package implementations;

import interfaces.StudentPrinterInterface;
import model.Student;

public class StudentPrinter implements StudentPrinterInterface {

    public void reportStudent(Student student) {
        System.out.println("Name:" + student.getName());
        System.out.println("Marks:" + student.getMarks());
    }

}
