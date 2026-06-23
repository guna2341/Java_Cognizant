package interfaces;

import javax.xml.crypto.Data;

// SRP
// Each class has only single responsibility
public interface StudentInterface {

     String setName(String name);

     int setMarks(int marks);

     String getName();

     int getMarks();

     void writeExam();

     void saveToDb(Database db);
}
