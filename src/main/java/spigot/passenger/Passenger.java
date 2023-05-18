package spigot.passenger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import spigot.passenger.events.PlayerInteractEntity;

public final class Passenger extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new PlayerInteractEntity(), this);
    }
}
