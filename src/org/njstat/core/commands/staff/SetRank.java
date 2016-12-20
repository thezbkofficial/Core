package org.njstat.core.commands.staff;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.njstat.core.Core;
import org.njstat.core.listeners.FileManager;
import org.njstat.core.utill.api.message;
import org.njstat.core.utill.api.prefix;

public class SetRank implements CommandExecutor {
	
	Core plugin;
	public SetRank(Core passedPlugin){
		this.plugin = passedPlugin;
	}
	

	FileManager fileManager = FileManager.getFileManager();

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("setrank")) {
			Player p = (Player) sender;
			if ((sender instanceof Player) || (sender instanceof ConsoleCommandSender)) {
				if (args.length == 0) {
					sender.sendMessage(
							ChatColor.translateAlternateColorCodes('&', prefix.CORE + message.SETRANK_USAGE));
				} else {
					if (!(fileManager.getrankConfig().getBoolean("groups.owner.users." + p.getUniqueId().toString()))) {
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
								prefix.RANKS + message.NOPERMISSION));

					} else {

						if (args.length > 0) {
							Player target = Bukkit.getPlayerExact(args[0]);
							if (args.length > 1) {
								if (args[1].equalsIgnoreCase("owner")) {

									fileManager.getrankConfig()
											.set("groups.owner.users." + target.getUniqueId().toString(), null);
									fileManager.getrankConfig()
									        .set("groups.dev.users." + target.getUniqueId().toString(), null);
									fileManager.getrankConfig()
											.set("groups.admin.users." + target.getUniqueId().toString(), null);
									fileManager.getrankConfig()
											.set("groups.moderator.users." + target.getUniqueId().toString(), null);
									fileManager.getrankConfig()
											.set("groups.default.users." + target.getUniqueId().toString(), null);
									fileManager.getrankConfig()
											.set("groups.builder.users." + target.getUniqueId().toString(), null);

									fileManager.getrankConfig()
											.set("groups.owner.users." + target.getUniqueId().toString(), true);

									fileManager.saverankConfig();
									fileManager.reloadrankConfig();
									sender.sendMessage(ChatColor.BLUE + ChatColor.BOLD.toString() + "CORE "
											+ ChatColor.GRAY + "Success.");
								}
								if (args[1].equalsIgnoreCase("dev")) {

									fileManager.getrankConfig()
											.set("groups.owner.users." + target.getUniqueId().toString(), null);
									fileManager.getrankConfig()
											.set("groups.admin.users." + target.getUniqueId().toString(), null);
									fileManager.getrankConfig()
											.set("groups.moderator.users." + target.getUniqueId().toString(), null);
									fileManager.getrankConfig()
											.set("groups.default.users." + target.getUniqueId().toString(), null);
									fileManager.getrankConfig()
											.set("groups.builder.users." + target.getUniqueId().toString(), null);

									fileManager.getrankConfig()
											.set("groups.dev.users." + target.getUniqueId().toString(), true);

									fileManager.saverankConfig();
									fileManager.reloadrankConfig();
									sender.sendMessage(ChatColor.BLUE + ChatColor.BOLD.toString() + "CORE "
											+ ChatColor.GRAY + "Success.");
								}
								if (args[1].equalsIgnoreCase("admin")) {

									fileManager.getrankConfig()
											.set("groups.owner.users." + target.getUniqueId().toString(), null);
									fileManager.getrankConfig()
					                        .set("groups.dev.users." + target.getUniqueId().toString(), null);
									fileManager.getrankConfig()
											.set("groups.admin.users." + target.getUniqueId().toString(), null);
									fileManager.getrankConfig()
											.set("groups.moderator.users." + target.getUniqueId().toString(), null);
									fileManager.getrankConfig()
											.set("groups.default.users." + target.getUniqueId().toString(), null);
									fileManager.getrankConfig()
											.set("groups.builder.users." + target.getUniqueId().toString(), null);

									fileManager.getrankConfig()
											.set("groups.admin.users." + target.getUniqueId().toString(), true);

									fileManager.saverankConfig();
									fileManager.reloadrankConfig();
									sender.sendMessage(ChatColor.BLUE + ChatColor.BOLD.toString() + "CORE "
											+ ChatColor.GRAY + "Success.");
								}
								if (args[1].equalsIgnoreCase("builder")) {

									fileManager.getrankConfig()
											.set("groups.owner.users." + target.getUniqueId().toString(), null);
									fileManager.getrankConfig()
					                        .set("groups.dev.users." + target.getUniqueId().toString(), null);
									fileManager.getrankConfig()
											.set("groups.admin.users." + target.getUniqueId().toString(), null);
									fileManager.getrankConfig()
											.set("groups.moderator.users." + target.getUniqueId().toString(), null);
									fileManager.getrankConfig()
											.set("groups.default.users." + target.getUniqueId().toString(), null);
									fileManager.getrankConfig()
											.set("groups.builder.users." + target.getUniqueId().toString(), null);

									fileManager.getrankConfig()
											.set("groups.builder.users." + target.getUniqueId().toString(), true);

									fileManager.saverankConfig();
									fileManager.reloadrankConfig();
									sender.sendMessage(ChatColor.BLUE + ChatColor.BOLD.toString() + "CORE "
											+ ChatColor.GRAY + "Success.");
								}
								if (args[1].equalsIgnoreCase("moderator")) {

									fileManager.getrankConfig()
											.set("groups.owner.users." + target.getUniqueId().toString(), null);
									fileManager.getrankConfig()
					                		.set("groups.dev.users." + target.getUniqueId().toString(), null);
									fileManager.getrankConfig()
											.set("groups.admin.users." + target.getUniqueId().toString(), null);
									fileManager.getrankConfig()
											.set("groups.moderator.users." + target.getUniqueId().toString(), null);
									fileManager.getrankConfig()
											.set("groups.default.users." + target.getUniqueId().toString(), null);
									fileManager.getrankConfig()
											.set("groups.builder.users." + target.getUniqueId().toString(), null);
									
									fileManager.getrankConfig()
											.set("groups.moderator.users." + target.getUniqueId().toString(), true);

									fileManager.saverankConfig();
									fileManager.reloadrankConfig();
									sender.sendMessage(ChatColor.BLUE + ChatColor.BOLD.toString() + "CORE "
											+ ChatColor.GRAY + "Success.");
								}
								if (args[1].equalsIgnoreCase("default")) {

									fileManager.getrankConfig()
											.set("groups.owner.users." + target.getUniqueId().toString(), null);
									fileManager.getrankConfig()
					                		.set("groups.dev.users." + target.getUniqueId().toString(), null);
									fileManager.getrankConfig()
											.set("groups.admin.users." + target.getUniqueId().toString(), null);
									fileManager.getrankConfig()
											.set("groups.moderator.users." + target.getUniqueId().toString(), null);
									fileManager.getrankConfig()
											.set("groups.default.users." + target.getUniqueId().toString(), null);
									fileManager.getrankConfig()
											.set("groups.builder.users." + target.getUniqueId().toString(), null);

									fileManager.getrankConfig()
											.set("groups.default.users." + target.getUniqueId().toString(), true);

									fileManager.saverankConfig();
									fileManager.reloadrankConfig();
									sender.sendMessage(ChatColor.BLUE + ChatColor.BOLD.toString() + "CORE "
											+ ChatColor.GRAY + "Success.");
								}
							}
						}
					}
				}
			}
		}
		return false;
	}
}