package com.spring;

public class InstrumentList implements Performer {
    private String song;
    private Instrument instrument;
    @Override
    public void perform() throws PerformanceException {
        System.out.println("song" + song);
        instrument.play();
    }
    public void setSong(String song){this.song=song;}

    public void setInstrument(Instrument instrument){this.instrument=instrument;}
}
