package Model.Impl;

import Model.StudentInterface;

public class Student implements StudentInterface {

    private String id;
    private String name;
    private String grade;

    @Override
    public StudentInterface setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public StudentInterface setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public StudentInterface setGrade(String grade) {
        this.grade = grade;
        return this;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getGrade() {
        return this.grade;
    }


}
