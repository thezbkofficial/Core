package org.njstat.core.listeners;


import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.njstat.core.utill.api.R;

public class Antidamage implements Listener{
	@EventHandler(priority = EventPriority.HIGH)
    public void onPlayerDamage(EntityDamageByEntityEvent event) {
		Player player = (Player) event.getDamager();
		
		Entity a = event.getEntity();
		 
        World w = a.getWorld();
 
        w.playEffect(a.getLocation(), Effect.STEP_SOUND, Material.REDSTONE_BLOCK);
        if(!R.isOwner(player) || R.isAdmin(player) || R.isDefault(player)){
        	event.setCancelled(true);
        }
    }
	@EventHandler
	public void onPlayerBreak(BlockBreakEvent event){
		Player p = event.getPlayer();
		if(!R.isOwner(p) || R.isAdmin(p) || R.isBuilder(p)){
	        event.setCancelled(true);
		}
	}
	@EventHandler
	public void onPlayerPlace(BlockPlaceEvent event){
		Player p = event.getPlayer();
		if(!R.isOwner(p) || R.isAdmin(p) || R.isBuilder(p)){
	        event.setCancelled(true);
		}
	}

}
