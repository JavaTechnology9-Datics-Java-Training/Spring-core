package com.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class ExamHall implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {
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

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Id: " + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactory: " + beanFactory);
        QuestionPaper questionPaper1=beanFactory.getBean("questionPaper")!=null?(QuestionPaper)beanFactory.getBean("questionPaper"):null;
        System.out.println(questionPaper1.exam());
    }


    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("BeforeInitialization: "+ o);
        System.out.println("BeforeInitialization: "+ s);
        return o;
    }


    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return o;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet() --calling");
    }

    @Override
    public void destroy() throws Exception {

    }
}
