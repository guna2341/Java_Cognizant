package implementations;

import interfaces.Database;
import model.Student;

public class SQL implements Database {
    @Override
    public void saveDb() {
        System.out.println("Saved to sql");
    }
}
