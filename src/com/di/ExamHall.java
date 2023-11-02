package com.di;

public class ExamHall {
    //private String examName;
    private QuestionPaper questionPaper;
    public ExamHall(QuestionPaper questionPaper){
        //this.examName=examName;
        System.out.println("ExamHall parameter constructor");
        this.questionPaper=questionPaper;
    }
    public ExamHall(){System.out.println("ExamHall default constructor");};
    public Exam performExam(){
        return questionPaper.exam();
    }
    public void setQuestionPaper(QuestionPaper questionPaper){
        this.questionPaper=questionPaper;
        System.out.println("setQuestionPaper()  calling");
    }

}
