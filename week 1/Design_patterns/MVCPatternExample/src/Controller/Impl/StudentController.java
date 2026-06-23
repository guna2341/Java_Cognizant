package Controller.Impl;

import Controller.ControllerInterface;
import Model.Impl.Student;
import View.Impl.StudentView;

public class StudentController implements ControllerInterface {

    private Student student;
    private StudentView view;

    public StudentController(Student student, StudentView view) {
        this.student = student;
        this.view = view;
    }

    @Override
    public StudentController setStudentId(String id) {
        student.setId(id);
        return this;
    }

    @Override
    public StudentController setStudentName(String name) {
        student.setName(name);
        return this;
    }

    @Override
    public StudentController setStudentGrade(String grade) {
        student.setGrade(grade);
        return this;
    }

    @Override
    public String displayView() {
        return view.displayStudentDetails(student.getId(), student.getName(), student.getGrade());
    }

}
