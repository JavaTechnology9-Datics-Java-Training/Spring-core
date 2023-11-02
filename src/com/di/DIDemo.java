package com.di;

import core.GreetingService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

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
        ExamHall examHall=(ExamHall)applicationContext.getBean("examHall");
        Exam exam = examHall.performExam();
        System.out.println(exam);
    }
}
