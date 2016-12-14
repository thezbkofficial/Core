package org.njstat.core.util;

import net.md_5.bungee.api.ChatColor;

public interface message {
	
	String GAMEMODE_CREATIVE = ChatColor.translateAlternateColorCodes('&', "Gamemode set to &acreative");
	String GAMEMODE_SURVIVAL = ChatColor.translateAlternateColorCodes('&', "Gamemode set to &asurvival");
	String CORE = ChatColor.translateAlternateColorCodes('&', "Core is running version ");
	String CORE_VERISON = ChatColor.translateAlternateColorCodes('&', "&abeta3 &7[December 14 2016]");
	String CORE_IS_STAFF = ChatColor.translateAlternateColorCodes('&', "You are staff");
	
	String NOPERMISSION = ChatColor.translateAlternateColorCodes('&', "&cNo permission");
	String NOTONLINE = ChatColor.translateAlternateColorCodes('&', "&cThat player is not online");
	
	String SETRANK_USAGE = ChatColor.translateAlternateColorCodes('&', "/setrank <player> <rank>");
	
	String SPAWN_SET = ChatColor.translateAlternateColorCodes('&', "Spawnpoint set in ");
    String SPAWN = ChatColor.translateAlternateColorCodes('&', "Sent to spawn");
    
    String SERVER_SELECTOR_NAME = ChatColor.translateAlternateColorCodes('&', "&aServer Selector");
    
	public void setValue();

}
