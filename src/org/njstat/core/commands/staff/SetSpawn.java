package org.njstat.core.commands.staff;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.njstat.core.Core;
import org.njstat.core.utill.api.message;
import org.njstat.core.utill.api.prefix;

public class SetSpawn implements CommandExecutor{
	
	Core plugin;
	public SetSpawn(Core passedPlugin){
		this.plugin = passedPlugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		Player p = (Player) sender;
		if (p.isOp()){
	        p.getWorld().setSpawnLocation(p.getLocation().getBlockX(), p.getLocation().getBlockY(), p.getLocation().getBlockZ());
	        p.sendMessage(ChatColor.YELLOW + prefix.SPAWN + message.SPAWN_SET + ChatColor.GREEN + p.getWorld().getName());
	      }
	    if (!p.isOp()) {
	        p.sendMessage(ChatColor.RED + prefix.RANKS + message.NOPERMISSION);
	      }
		return true;
		
	}

}
