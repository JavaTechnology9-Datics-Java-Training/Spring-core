package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DIDemo {
    public static void main(String[] args) {
        /*BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("D:\\Eclipse_Workspaces\\CoreJava\\SpringCore\\src\\spring.xml"));
        ExamHall examHall=(ExamHall) beanFactory.getBean("examHall");
        Exam exam = examHall.performExam();
        System.out.println(exam);*/
        ApplicationContext applicationContext=
                new FileSystemXmlApplicationContext("D:\\Eclipse_Workspaces\\CoreJava\\SpringCore\\src\\spring.xml");
        /*ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("spring.xml");*/
        /*ExamHall examHall=(ExamHall)applicationContext.getBean("examHall");
        Exam exam = examHall.performExam();
        System.out.println(exam);*/
        /*Cricket cricket=(Cricket) applicationContext.getBean("cricket");
        try {
            cricket.perform();
        } catch (PerformanceException e) {
            throw new RuntimeException(e);
        }*/
        InstrumentList instrumentList=(InstrumentList) applicationContext.getBean("instrumentList");
        try {
            instrumentList.perform();
        } catch (PerformanceException e) {
            throw new RuntimeException(e);
        }
    }
}
