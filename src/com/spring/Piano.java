package com.spring;

public class Piano implements Instrument{
    @Override
    public void play()  {
        System.out.println("PLINK PLINK PLINK");
       // throw new RuntimeException("Throwing the exception from initialize() method");
    }
}
