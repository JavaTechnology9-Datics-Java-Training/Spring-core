package com.di;

public class QuestionPaper2 implements QuestionPaper{
    @Override
    public Exam exam() {
        return new Exam("English");
    }
}
