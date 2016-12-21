package org.njstat.core.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.njstat.core.Core;
import org.njstat.core.listeners.FileManager;
import org.njstat.core.utill.api.prefix;

public class msg implements CommandExecutor {
	Core plugin;

	public msg(Core passedPlugin) {
		this.plugin = passedPlugin;
	}

	FileManager fileManager = FileManager.getFileManager();

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if (!(sender instanceof ConsoleCommandSender)) {
			Player target = Bukkit.getPlayer(args[0]);

			if (target != null) {

				String message = "";

				for (int i = 1; i != args.length; i++)

					message += args[i] + " ";

				target.sendMessage("§d" + sender.getName() + " §7" + message);

				sender.sendMessage("§dTo " + target.getName() + " §7" + message);

			}

			else if (!(target != null)) {

				sender.sendMessage(prefix.CORE + "That player is not currently online!");

			}
		} else{
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cOnly players can do this"));
		}

		return true;

	}

}