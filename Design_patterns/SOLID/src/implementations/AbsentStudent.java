package implementations;

import model.Student;

public class AbsentStudent extends Student {
    @Override
    public void writeExam() {
        throw new RuntimeException("Student is Absent");
    }
}
