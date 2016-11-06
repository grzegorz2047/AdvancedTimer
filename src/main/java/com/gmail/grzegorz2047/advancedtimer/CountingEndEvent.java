package com.gmail.grzegorz2047.advancedtimer;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Created by grzeg on 06.11.2016.
 */
public class CountingEndEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private final Counter counter;

    public CountingEndEvent(Counter counter){
        this.counter = counter;
    }

    public HandlerList getHandlers() {
        return handlers;
    }
    public static HandlerList getHandlerList() {
        return handlers;
    }

    public Counter getCounter() {
        return counter;
    }
}