import Controller.Impl.StudentController;
import Model.Impl.Student;
import View.Impl.StudentView;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        controller.setStudentId("1");
        controller.setStudentName("Gunanihil N");
        controller.setStudentGrade("8.1");
        System.out.println(controller.displayView());
    }
}