package com.gmail.grzegorz2047.advancedtimer.listeners;

import com.gmail.grzegorz2047.advancedtimer.CountingEndEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

/**
 * Created by grzeg on 06.11.2016.
 */
public class CountingEndListener implements Listener {


    @EventHandler
    public void onCountingEnd(CountingEndEvent e){
        System.out.println("czas: " + e.getCounter().getTime() +" - ZAKONCZONO");


    }
}
