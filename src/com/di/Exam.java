package com.di;

public class Exam {
    private String name;
    public Exam(){};
    public Exam(String name){this.name=name;};

    @Override
    public String toString() {
        return "Exam{" +
                "name='" + name + '\'' +
                '}';
    }
}
