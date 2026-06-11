package implementations;

import interfaces.Database;
import model.Student;

public class MongoDB implements Database {
    @Override
    public void saveDb() {
        System.out.println("Saved to mongodb");
    }
}
