package Controller;

import Controller.Impl.StudentController;

public interface ControllerInterface {

    StudentController setStudentId(String id);

    StudentController setStudentName(String name);

    StudentController setStudentGrade(String name);

    String displayView();

}
