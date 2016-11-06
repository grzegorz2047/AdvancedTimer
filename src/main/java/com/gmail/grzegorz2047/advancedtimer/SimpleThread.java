package com.gmail.grzegorz2047.advancedtimer;

/**
 * Created by grzeg on 06.11.2016.
 */
public class SimpleThread implements Runnable {

    private final AdvancedTimer advancedTimer;
    private final Counter counter;

    public SimpleThread(AdvancedTimer advancedTimer, Counter counter){
        this.advancedTimer = advancedTimer;
        this.counter = counter;

    }

    public void run() {
        counter.count();
    }
}
