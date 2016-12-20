package org.njstat.core.utill;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.njstat.core.listeners.FileManager;
import org.njstat.core.utill.api.ChatFormat;
import org.njstat.core.utill.api.R;

public class ChatFormats implements Listener{
    FileManager fileManager = FileManager.getFileManager();

	@EventHandler
	public void chat(AsyncPlayerChatEvent event){
		Player p = event.getPlayer();
		if(R.isOwner(p)){
			event.setFormat(ChatFormat.OWNER);
		} else if (R.isDev(p)){
			event.setFormat(ChatFormat.DEV);
		} else if (R.isMod(p)){
			event.setFormat(ChatFormat.MOD);
		} else if (R.isBuilder(p)){
			event.setFormat(ChatFormat.BUILDER);
		} else if (R.isAdmin(p)){
			event.setFormat(ChatFormat.ADMIN);
		}
		else {
			event.setFormat(ChatFormat.DEFAULT);
		}
		
		
	}

}
