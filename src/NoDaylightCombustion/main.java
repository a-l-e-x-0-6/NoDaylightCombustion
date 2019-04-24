package com.github.a_l_e_x_0_6.NoDaylightCombustion;
import org.bukkit.plugin.java.JavaPlugin;


public class main extends JavaPlugin {
    // Fired when plugin is first enabled
    @Override
    public void onEnable() {
    	getServer().getPluginManager().registerEvents(new MyListener(), this);
    }
    // Fired when plugin is disabled
    @Override
    public void onDisable() {

    }
    
}