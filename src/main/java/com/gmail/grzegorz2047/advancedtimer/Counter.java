package com.gmail.grzegorz2047.advancedtimer;

import org.bukkit.Bukkit;

/**
 * Created by grzeg on 06.11.2016.
 */
public class Counter {
    private int time = 0;
    private boolean running = false;

    public Counter(int time){
        this.time = time;
        this.running = true;
    }

    public void count() {
        if (running) {
            if (time > 0) {
                time--;
                CountingEvent countingEvent = new CountingEvent(this);
                Bukkit.getPluginManager().callEvent(countingEvent);
            } else {
                running = false;
                CountingEndEvent countingEndEvent = new CountingEndEvent(this);
                Bukkit.getPluginManager().callEvent(countingEndEvent);

            }
        }

    }

    public void restart(int newtime){
        time = newtime;
        running = true;
    }

    public void cancel() {
        time = 0;
        running = false;
    }

    public int getTime() {
        return time;
    }

    public boolean isRunning() {
        return running;
    }
}
