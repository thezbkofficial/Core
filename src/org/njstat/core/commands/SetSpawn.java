package org.njstat.core.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.njstat.core.Core;

public class SetSpawn implements CommandExecutor{
	
	Core plugin;
	public SetSpawn(Core passedPlugin){
		this.plugin = passedPlugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		Player p = (Player) sender;
		if (p.isOp()){
	        p.getWorld().setSpawnLocation(p.getLocation().getBlockX(), p.getLocation().getBlockY(), p.getLocation().getBlockZ());
	        p.sendMessage(ChatColor.YELLOW + "§6§lCORE §7Set spawn in §a" + p.getWorld().getName());
	      }
	    if (!p.isOp()) {
	        p.sendMessage(ChatColor.RED + "§9§lRANKS §7Error. You do not have permission");
	      }
		return true;
		
	}

}
