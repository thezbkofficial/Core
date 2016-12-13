package org.njstat.core.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.njstat.core.Core;
import org.njstat.core.util.FileManager;
import org.njstat.core.util.R;
public class Gamemode implements CommandExecutor {
	Core plugin;
	public Gamemode(Core passedPlugin){
		this.plugin = passedPlugin;
	}
	FileManager fileManager = FileManager.getFileManager();
	String prefix = "§9§lCORE§7 ";

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		Player player = (Player) sender;
		
		if(!R.isDev(player) || R.isOwner(player) || R.isAdmin(player) || R.isBuilder(player) || player.isOp()){
			sender.sendMessage(prefix + "No permissions.");
		}
		else if(args.length == 1){
			if(args[0].equalsIgnoreCase("creative")){
				player.sendMessage(prefix + "Gamemode set to creative");
				player.setGameMode(GameMode.CREATIVE);
				return true;
			}
			else if(args[0].equalsIgnoreCase("survival")){
				player.sendMessage(prefix + "Gamemode set to survival");
				player.setGameMode(GameMode.SURVIVAL);
				return true;
			}
			
		}
		return true;
		
	}

}