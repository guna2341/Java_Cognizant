package interfaces;

import model.Student;

// Dependency Injection
// create Database implementation and pass it through params to avoid dapendency injection
public interface Database {

    public void saveDb();

}
