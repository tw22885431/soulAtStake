package testfive.game;


import org.bukkit.entity.Snowman;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;



public class Ghost implements Listener {

    public Ghost() {

    }

    @EventHandler
    public void ghostShop(PlayerInteractEntityEvent playerInteractEntityEvent){

        if (playerInteractEntityEvent.getRightClicked() instanceof Snowman){



       }

    }

}
