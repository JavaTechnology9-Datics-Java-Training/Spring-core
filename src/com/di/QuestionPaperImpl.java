package com.di;

public class QuestionPaperImpl implements QuestionPaper{
    @Override
    public Exam exam() {
        return new Exam("maths");
    }
}
