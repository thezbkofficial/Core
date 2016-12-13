package org.njstat.core.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.njstat.core.Core;
import org.njstat.core.util.prefix;

public class Spawn implements CommandExecutor{
	Core plugin;
	public Spawn(Core passedPlugin){
		this.plugin = passedPlugin;
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		Player p = (Player) sender;
		p.teleport(p.getWorld().getSpawnLocation());
        p.sendMessage(ChatColor.YELLOW + prefix.spawn + "Sent to spawn");
		return true;
	}
}
