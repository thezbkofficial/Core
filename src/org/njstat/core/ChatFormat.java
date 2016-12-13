package org.njstat.core;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.njstat.core.util.FileManager;
import org.njstat.core.util.R;

import net.md_5.bungee.api.ChatColor;

public class ChatFormat implements Listener{
    FileManager fileManager = FileManager.getFileManager();

	@EventHandler
	public void chat(AsyncPlayerChatEvent event){
		Player p = event.getPlayer();
		if(R.isOwner(p)){
			event.setFormat(ChatColor.DARK_RED + "" + ChatColor.BOLD + "OWNER " + ChatColor.YELLOW + "%s §f%s");
		} else if (R.isDev(p)){
			event.setFormat(ChatColor.DARK_RED + "" + ChatColor.BOLD + "DEV " + ChatColor.YELLOW + "%s §f%s");

		} else if (R.isMod(p)){
			event.setFormat(ChatColor.GOLD + "" + ChatColor.BOLD + "MOD " + ChatColor.YELLOW + "%s §f%s");
		} else if (R.isBuilder(p)){
			event.setFormat(ChatColor.BLUE + "" + ChatColor.BOLD + "BUILDER " + ChatColor.YELLOW + "%s §f%s");
		}
		else {
			event.setFormat(ChatColor.YELLOW + "%s §f%s");
		}
		
		
	}

}
