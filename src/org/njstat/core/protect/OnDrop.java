package org.njstat.core.protect;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.njstat.core.util.R;

public class OnDrop implements Listener{
	
	@EventHandler
	public void onDrop(PlayerDropItemEvent event){
		Player p = event.getPlayer();
		if (!R.isOwner(p) || R.isAdmin(p) || R.isBuilder(p) || R.isDev(p)){
			event.setCancelled(true);
		}
	}

}
