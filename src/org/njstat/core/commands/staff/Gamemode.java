package org.njstat.core.commands.staff;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.njstat.core.Core;
import org.njstat.core.listeners.FileManager;
import org.njstat.core.utill.api.R;
import org.njstat.core.utill.api.message;
import org.njstat.core.utill.api.prefix;
public class Gamemode implements CommandExecutor {
	Core plugin;
	public Gamemode(Core passedPlugin){
		this.plugin = passedPlugin;
	}
	FileManager fileManager = FileManager.getFileManager();

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		Player player = (Player) sender;
		
		if(R.isDev(player) || R.isAdmin(player) || R.isOwner(player)){
			if(args.length == 1){
				if(args[0].equalsIgnoreCase("creative")){
					player.sendMessage(prefix.CORE + message.GAMEMODE_CREATIVE);
					player.setGameMode(GameMode.CREATIVE);
					return true;
				}else if(args[0].equalsIgnoreCase("survival")){
					player.sendMessage(prefix.CORE + message.GAMEMODE_SURVIVAL);
					player.setGameMode(GameMode.SURVIVAL);
					return true;
				}else if(args[0].equalsIgnoreCase("c")){
					player.sendMessage(prefix.CORE + message.GAMEMODE_CREATIVE);
					player.setGameMode(GameMode.CREATIVE);
					return true;
				}else if(args[0].equalsIgnoreCase("s")){
					player.sendMessage(prefix.CORE + message.GAMEMODE_SURVIVAL);
					player.setGameMode(GameMode.SURVIVAL);
					return true;
				}
				
				else {
					player.sendMessage(prefix.CORE + message.GAMEMODE_INVALID);
				}
				
			} else{
				player.sendMessage(prefix.CORE + message.INVALID);
			}
		} else{
			player.sendMessage(prefix.RANKS + message.NOPERMISSION);
		}
		
		return true;
		
	}

}