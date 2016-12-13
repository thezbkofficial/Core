package org.njstat.core.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.njstat.core.Core;

public class CoreCommand implements CommandExecutor{
	
	Core plugin;
	public CoreCommand(Core passedPlugin){
		this.plugin = passedPlugin;
	}
	
	String version = "beta-1";

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		Player p = (Player) sender;
		p.sendMessage("§9§lCORE §7Is running version " + version);
		return true;
	}
}
