package com.spring;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class PropertiesTagExample implements Performer{
    private Properties instruments;
    public PropertiesTagExample(){};
    @Override
    public void perform() throws PerformanceException {
        for(Iterator iterator = instruments.keySet().iterator(); iterator.hasNext();){
            String key=(String) iterator.next();
            System.out.println(key+" :" + instruments.getProperty(key));
        }

    }
    public void setInstruments(Properties instruments){
        this.instruments=instruments;
    }
}
