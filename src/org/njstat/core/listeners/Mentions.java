package org.njstat.core.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Mentions implements Listener{
	
	@EventHandler
    public void onChat(AsyncPlayerChatEvent e){
        for(Player on:Bukkit.getServer().getOnlinePlayers()){
            if(on.equals(e.getPlayer()))continue;
            if(e.getMessage().contains(on.getName())){
 
                e.setMessage(e.getMessage().replaceAll(on.getName(), ChatColor.GREEN+"@"+on.getName()+ChatColor.RESET));
            }
        }
    }

}
