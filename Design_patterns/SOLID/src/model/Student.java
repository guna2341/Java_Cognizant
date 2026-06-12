package model;


import interfaces.Database;
import interfaces.StudentInterface;

public class Student implements StudentInterface {
    private String name;
    private int marks;

    public Student() { };

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String setName(String name) {
        this.name = name;
        return this.name;
    }

    @Override
    public int setMarks(int marks) {
        this.marks = marks;
        return this.marks;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getMarks() {
        return this.marks;
    }

    @Override
    public void writeExam() {
        System.out.println("Student writes exam");
    }

    @Override
    public void saveToDb(Database db) {
        db.saveDb();
    }
}


