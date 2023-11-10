package com.spring;

public class Cricket implements Performer{
    private double overs=3;
    public Cricket(){};
    public Cricket(double overs){this.overs=overs;};
    @Override
    public void perform() throws PerformanceException {
        System.out.println(overs + "  overs completed");
    }
}
