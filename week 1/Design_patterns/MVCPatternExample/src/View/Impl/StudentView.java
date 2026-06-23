package View.Impl;

import View.StudentViewInterface;

public class StudentView implements StudentViewInterface {

    @Override
    public String displayStudentDetails(String id, String name, String grade) {
        return "ID: " + id + "\nName: " + name + "\nGrade: " + grade;
    }
}
