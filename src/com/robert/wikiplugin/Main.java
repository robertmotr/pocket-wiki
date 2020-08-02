package com.robert.wikiplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override public void onEnable() { this.getCommand("wiki").setExecutor(new CommandWiki()); }

    @Override public void onDisable() { }
}
