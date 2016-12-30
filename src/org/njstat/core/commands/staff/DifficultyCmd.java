package org.njstat.core.commands.staff;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Difficulty;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.njstat.core.Core;
import org.njstat.core.listeners.FileManager;
import org.njstat.core.utill.api.R;
import org.njstat.core.utill.api.message;
import org.njstat.core.utill.api.prefix;

public class DifficultyCmd implements CommandExecutor {
	Core plugin;

	public DifficultyCmd(Core passedPlugin) {
		this.plugin = passedPlugin;
	}

	FileManager fileManager = FileManager.getFileManager();

	World world = Bukkit.getServer().getWorld("world");

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if (!(sender instanceof ConsoleCommandSender)) {
			Player player = (Player) sender;

			if (R.isDev(player) || R.isAdmin(player) || R.isOwner(player)) {
				if (args.length == 1) {
					if (args[0].equalsIgnoreCase("peaceful")) {
						player.sendMessage(prefix.CORE + message.DIFFICULTY0);
						world.setDifficulty(Difficulty.PEACEFUL);
						return true;
					} else if (args[0].equalsIgnoreCase("easy")) {
						player.sendMessage(prefix.CORE + message.DIFFICULTY1);
						world.setDifficulty(Difficulty.EASY);
						return true;
					} else if (args[0].equalsIgnoreCase("normal")) {
						player.sendMessage(prefix.CORE + message.DIFFICULTY2);
						world.setDifficulty(Difficulty.NORMAL);
						return true;
					} else if (args[0].equalsIgnoreCase("hard")) {
						player.sendMessage(prefix.CORE + message.DIFFICULTY3);
						world.setDifficulty(Difficulty.HARD);
						return true;
					} else if (args[0].equalsIgnoreCase("0")) {
						player.sendMessage(prefix.CORE + message.DIFFICULTY0);
						world.setDifficulty(Difficulty.PEACEFUL);
						return true;
					} else if (args[0].equalsIgnoreCase("1")) {
						player.sendMessage(prefix.CORE + message.DIFFICULTY1);
						world.setDifficulty(Difficulty.EASY);
						return true;
					} else if (args[0].equalsIgnoreCase("2")) {
						player.sendMessage(prefix.CORE + message.DIFFICULTY2);
						world.setDifficulty(Difficulty.NORMAL);
						return true;
					} else if (args[0].equalsIgnoreCase("3")) {
						player.sendMessage(prefix.CORE + message.DIFFICULTY3);
						world.setDifficulty(Difficulty.HARD);
						return true;
					}

					else {
						player.sendMessage(prefix.CORE + message.GAMEMODE_INVALID);
					}

				} else {
					player.sendMessage(prefix.CORE + message.INVALID);
				}
			} else {
				player.sendMessage(prefix.RANKS + message.NOPERMISSION);
			}

		} else{
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cOnly players can do this"));
		}
		return true;

	}

}