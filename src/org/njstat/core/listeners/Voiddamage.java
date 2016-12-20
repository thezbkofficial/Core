package org.njstat.core.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.njstat.core.utill.api.R;

public class Voiddamage implements Listener{
	
	@EventHandler
	public void voidfall(PlayerMoveEvent event){
		Player p = (Player) event.getPlayer();
		if(!R.isOwner(p) || R.isDev(p)){
			if (p.getLocation().getY() < 63) {
				p.teleport(p.getWorld().getSpawnLocation());
	        }
		}
	}

}
