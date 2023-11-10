package com.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.dao.DataAccessException;

import java.sql.SQLException;

public class InstrumentList extends AbstractExample implements Performer, InitializingBean{
    private String song;
    private Instrument inst;
    // Autowire with constructor
    public InstrumentList(Instrument inst){
        this.inst=inst;
    }
    @Override
    public void perform() throws PerformanceException {
        System.out.println("song" + song);
        inst.play();
    }
    public void setSong(String song){this.song=song;}
    // Autowire with byName
   /* public void setInst(Instrument instrument){this.inst=instrument;}*/

    // Autowire with byType
    /* public void setInstrument(Instrument instrument){this.inst=instrument;}*/

    public void initialize(){
        System.out.println("Instrument ----initialize() method");
    }

    public void destroy(){
        System.out.println("Instrument ----destroy() method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
