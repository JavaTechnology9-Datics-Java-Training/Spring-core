package com.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanId) throws BeansException {
        System.out.println("BeforeInitialization() ---calling");
        System.out.println("BeforeInitialization _ o: "+ bean);
        System.out.println("BeforeInitialization _ s: "+ beanId);
        if(bean instanceof ExamHall){
            ExamHall examHall=(ExamHall) bean;
            System.out.println(examHall);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("AfterInitialization() ---calling");
        System.out.println("BeforeInitialization _ o: "+ o);
        System.out.println("BeforeInitialization _ s: "+ s);
        return o;
    }
}
