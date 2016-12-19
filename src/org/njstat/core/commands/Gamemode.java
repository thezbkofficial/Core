package org.njstat.core.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.njstat.core.Core;
import org.njstat.core.util.FileManager;
import org.njstat.core.util.R;
import org.njstat.core.util.message;
import org.njstat.core.util.prefix;
public class Gamemode implements CommandExecutor {
	Core plugin;
	public Gamemode(Core passedPlugin){
		this.plugin = passedPlugin;
	}
	FileManager fileManager = FileManager.getFileManager();

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		Player player = (Player) sender;
		
		if(!R.isDev(player) || R.isAdmin(player) || R.isOwner(player)){
			sender.sendMessage(prefix.ranks + message.NOPERMISSION);
		}
		else if(args.length == 1){
			if(args[0].equalsIgnoreCase("creative")){
				player.sendMessage(prefix.core + message.GAMEMODE_CREATIVE);
				player.setGameMode(GameMode.CREATIVE);
				return true;
			}else if(args[0].equalsIgnoreCase("survival")){
				player.sendMessage(prefix.core + message.GAMEMODE_SURVIVAL);
				player.setGameMode(GameMode.SURVIVAL);
				return true;
			}else if(args[0].equalsIgnoreCase("c")){
				player.sendMessage(prefix.core + message.GAMEMODE_CREATIVE);
				player.setGameMode(GameMode.CREATIVE);
				return true;
			}else if(args[0].equalsIgnoreCase("s")){
				player.sendMessage(prefix.core + message.GAMEMODE_SURVIVAL);
				player.setGameMode(GameMode.SURVIVAL);
				return true;
			}
			
			else {
				player.sendMessage(prefix.core + message.GAMEMODE_INVALID);
			}
			
		}
		return true;
		
	}

}