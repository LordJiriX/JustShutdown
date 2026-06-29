package io.github.lordjirix.justShutdown;

import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;


public final class JustShutdown extends JavaPlugin {
    @Override
    public void onLoad() {
        Server server = getServer();
        server.shutdown();
    }

    @Override
    public void onEnable() {
        Server server = getServer();
        server.shutdown();
    }

    @Override
    public void onDisable() {

    }
}
