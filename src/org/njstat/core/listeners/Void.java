package org.njstat.core.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class Void implements Listener{
	
	@EventHandler
	public void voidfall(PlayerMoveEvent event){
		Player player = (Player) event.getPlayer();
		if (player.getLocation().getY() < 9) {
            player.performCommand("spawn");
        }
	}

}
