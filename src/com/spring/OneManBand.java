package com.spring;

import java.util.Collection;

public class OneManBand implements Performer{
    private Collection<Instrument> instruments;
    public OneManBand(){};
    @Override
    public void perform() throws PerformanceException {
        instruments.forEach(Instrument::play);
    }
    public void setInstruments(Collection<Instrument> instruments){
        this.instruments=instruments;
    }
}
