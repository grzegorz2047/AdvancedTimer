package com.gmail.grzegorz2047.advancedtimer.listeners;

import com.gmail.grzegorz2047.advancedtimer.AdvancedTimer;
import com.gmail.grzegorz2047.advancedtimer.CountingEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

/**
 * Created by grzeg on 06.11.2016.
 */
public class CountingListener implements Listener {

    private final AdvancedTimer advancedTimer;

    public CountingListener(AdvancedTimer advancedTimer) {
        this.advancedTimer = advancedTimer;
    }

    @EventHandler
    public void onCounting(CountingEvent e) {
        System.out.println("czas: " + e.getCounter().getTime());
        int result = advancedTimer.myMethod();
        System.out.println("Wynik to " + result);
    }

}
