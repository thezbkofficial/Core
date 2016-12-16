package org.njstat.core.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class Voiddamage implements Listener{
	
	@EventHandler
	public void voidfall(PlayerMoveEvent event){
		Player player = (Player) event.getPlayer();
		if (player.getLocation().getY() < 40) {
            player.performCommand("spawn");
        }
	}

}
