package implementations;

import interfaces.StudentInputInterface;
import model.Student;

import java.util.Scanner;

public class StudentInput implements StudentInputInterface {
    public Student createStudent() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student: ");
        String name = in.nextLine();
        System.out.print("Enter marks: ");
        int marks = in.nextInt();
        Student student = new Student(name, marks);
        return student;
    }
}
