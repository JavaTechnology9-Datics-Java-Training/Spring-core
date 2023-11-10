package com.spring;

import org.springframework.beans.factory.annotation.Value;

public class Piano implements Instrument{
    //@Value("#{sound.value}")
    private String sound;

    public void setSound(String sound){this.sound=sound;};
    @Override
    public void play()  {
        System.out.println("PLINK PLINK PLINK");
       // throw new RuntimeException("Throwing the exception from initialize() method");
    }

    public String getSound() {
        return sound;
    }
}
