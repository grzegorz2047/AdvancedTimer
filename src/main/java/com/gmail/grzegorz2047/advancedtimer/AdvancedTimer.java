package com.gmail.grzegorz2047.advancedtimer;

import com.gmail.grzegorz2047.advancedtimer.listeners.CountingEndListener;
import com.gmail.grzegorz2047.advancedtimer.listeners.CountingListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by grzeg on 06.11.2016.
 */
public class AdvancedTimer extends JavaPlugin {

    private Counter counter;

    @Override
    public void onEnable() {
        counter = new Counter(20);
        Bukkit.getScheduler().runTaskTimer(this, new SimpleThread(this, counter), 0, 20l);
        registerListeners();
    }

    public void registerListeners(){
        Bukkit.getPluginManager().registerEvents(new CountingListener(this), this );
        Bukkit.getPluginManager().registerEvents(new CountingEndListener(), this );
    }
    @Override
    public void onDisable() {
        super.onDisable();
    }
    public int myMethod(){
        return 2+2;
    }
}
