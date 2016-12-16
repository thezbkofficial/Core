package org.njstat.core.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.njstat.core.Core;
import org.njstat.core.util.message;
import org.njstat.core.util.prefix;

public class Debug implements CommandExecutor{
	
	Core plugin;
	public Debug(Core passedPlugin){
		this.plugin = passedPlugin;
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		Player p = (Player) sender;
		long mem = Runtime.getRuntime().freeMemory();
		long cpu = Runtime.getRuntime().availableProcessors();
		long maxmem = Runtime.getRuntime().maxMemory();
		p.sendMessage(prefix.core + ChatColor.GREEN + "Server Status");
		p.sendMessage(prefix.core + message.MEMORY + bytesToMeg(mem) + ChatColor.GRAY + " MB");
		p.sendMessage(prefix.core + message.MAXMEM + bytesToMeg(maxmem) + ChatColor.GRAY + " MB");
		p.sendMessage(prefix.core + message.CPU + cpu);
		p.sendMessage(prefix.core + message.CORE + message.CORE_VERSION);
		

		return true;
	}
	private static final long  MEGABYTE = 1024L * 1024L;

	public static long bytesToMeg(long bytes) {
		  return bytes / MEGABYTE ;
	}

}
