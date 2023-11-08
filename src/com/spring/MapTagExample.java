package com.spring;

import java.util.Collection;
import java.util.Map;

public class MapTagExample implements Performer{
    private Map<String,Instrument> instruments;
    public MapTagExample(){};
    @Override
    public void perform() throws PerformanceException {
       instruments.entrySet().forEach(entry->{
           System.out.print(entry.getKey()+ " :");
           entry.getValue().play();
       });
    }
    public void setInstruments(Map<String,Instrument> instruments){
        this.instruments=instruments;
    }
}
