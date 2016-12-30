package org.njstat.core.utill.api;

import net.md_5.bungee.api.ChatColor;

public interface prefix {
	
	//Added "game" for bungeecord intergration coming soon (tm).
	String CORE = ChatColor.translateAlternateColorCodes('&', "&9&lCORE &7");
	String RANKS = ChatColor.translateAlternateColorCodes('&', "&9&lRANKS &7");
	String SPAWN = ChatColor.translateAlternateColorCodes('&', "&6&lSPAWN &7");
	String GAME = ChatColor.translateAlternateColorCodes('&', "&3&lGAME &7");
	//staff prefix in preperation for punishment features.
	String STAFF = ChatColor.translateAlternameColorCodes('&', "&6&lSTAFF &7")

}
