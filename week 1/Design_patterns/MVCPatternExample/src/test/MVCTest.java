package test;

import Controller.Impl.StudentController;
import Model.Impl.Student;
import View.Impl.StudentView;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MVCTest {

    @Test
    public void test() {
        Student student = new Student();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        controller.setStudentId("1").setStudentName("Gunanihil N").setStudentGrade("8.1");
        assertEquals("ID: 1\nName: Gunanihil N\nGrade: 8.1", controller.displayView());
    }

}
