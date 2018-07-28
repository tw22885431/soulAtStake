package testfive.testfive;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import testfive.game.Gamebler;
import testfive.game.Ghost;

public final class TestFive extends JavaPlugin {

    @Override
    public void onEnable() {

        getLogger().info("test start");

        getServer().getPluginCommand("stake").setExecutor(new soulAtStake(this));

        Bukkit.getPluginManager().registerEvents(new Gamebler(),this);

        Bukkit.getPluginManager().registerEvents(new Ghost(),this);

    }

    @Override
    public void onDisable() {

        getLogger().info("test end");

    }



}
