package org.njstat.core.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.njstat.core.Core;
import org.njstat.core.utill.api.message;
import org.njstat.core.utill.api.prefix;

public class Debug implements CommandExecutor {

	Core plugin;

	public Debug(Core passedPlugin) {
		this.plugin = passedPlugin;
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof ConsoleCommandSender)) {

			Player p = (Player) sender;
			long mem = Runtime.getRuntime().freeMemory();
			long cpu = Runtime.getRuntime().availableProcessors();
			long maxmem = Runtime.getRuntime().maxMemory();
			p.sendMessage(prefix.CORE + ChatColor.GREEN + "Server Status");
			p.sendMessage(prefix.CORE + message.MEMORY + bytesToMeg(mem) + ChatColor.GRAY + " MB");
			p.sendMessage(prefix.CORE + message.MAXMEM + bytesToMeg(maxmem) + ChatColor.GRAY + " MB");
			p.sendMessage(prefix.CORE + message.CPU + cpu);
			p.sendMessage(prefix.CORE + message.CORE + message.CORE_VERSION);

		} else {
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cOnly players can do this"));
		}

		return true;
	}

	private static final long MEGABYTE = 1024L * 1024L;

	public static long bytesToMeg(long bytes) {
		return bytes / MEGABYTE;
	}

}
