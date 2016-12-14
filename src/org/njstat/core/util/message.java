package org.njstat.core.util;

import net.md_5.bungee.api.ChatColor;

public interface message {
	
	String GAMEMODE_CREATIVE = "Gamemode set to creative";
	String GAMEMODE_SURVIVAL = "Gamemode set to survival";
	String CORE = "Core is running version";
	String CORE_VERISON = "beta3 [December 14 2016]";
	String CORE_IS_STAFF = "You are staff";
	
	String NOPERMISSION = "No permission";
	String NOTONLINE = "That player is not online";
	
	String SETRANK_USAGE = "/setrank <player> <rank>";
	
	String SPAWN_SET = "Spawnpoint set in ";
    String SPAWN = "Sent to spawn";
    
    String SERVER_SELECTOR_NAME = ChatColor.translateAlternateColorCodes('&', "&aServer Selector");
    
	public void setValue();

}
