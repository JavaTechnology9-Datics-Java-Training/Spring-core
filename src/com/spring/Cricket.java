package com.spring;

public class Cricket implements Performer{
    private int overs=3;
    public Cricket(){};
    public Cricket(int overs){this.overs=overs;};
    @Override
    public void perform() throws PerformanceException {
        System.out.println(overs + "  overs completed");
    }
}
