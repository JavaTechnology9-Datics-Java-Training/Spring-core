package com.spring;

public class QuestionPaper2 implements QuestionPaper{
    @Override
    public Exam exam() {
        return new Exam("English");
    }
}
