package me.targeters.starterplugin;

import me.targeters.starterplugin.commands.FlyCommand;
import me.targeters.starterplugin.listeners.PlayerListeners;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class StarterPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("fly").setExecutor(new FlyCommand());
        Bukkit.getPluginManager().registerEvents(new PlayerListeners(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
