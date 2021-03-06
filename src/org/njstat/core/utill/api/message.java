package org.njstat.core.utill.api;

import org.bukkit.ChatColor;

public interface message {
	
	//GENERAL
	String GAMEMODE_CREATIVE = ChatColor.translateAlternateColorCodes('&', "Gamemode set to &acreative");
	String GAMEMODE_SURVIVAL = ChatColor.translateAlternateColorCodes('&', "Gamemode set to &asurvival");
	String CORE = ChatColor.translateAlternateColorCodes('&', "Core is running version ");
	String VERSION = ChatColor.translateAlternateColorCodes('&', "Server version ");
	String CORE_VERSION = ChatColor.translateAlternateColorCodes('&', "&av1.0-alpha5 &7[December 19 2016]");
	String CORE_IS_STAFF = ChatColor.translateAlternateColorCodes('&', "You are staff");
	String INVALID = ChatColor.translateAlternateColorCodes('&', "invalid command usage");
	String GAMEMODE_INVALID = ChatColor.translateAlternateColorCodes('&', "Invlaid Gamemode." );
	String DIFFICULTY_INVALID = ChatColor.translateAlternateColorCodes('&', "Invlaid Difficulty." );

	
	//ERRORS
	String NOPERMISSION = ChatColor.translateAlternateColorCodes('&', "&cNo permission");
	String NOTONLINE = ChatColor.translateAlternateColorCodes('&', "That player is not online");
	String BYPASS = ChatColor.translateAlternateColorCodes('&', "Bypassing anti-move.");
	
	//Setrank
	String SETRANK_USAGE = ChatColor.translateAlternateColorCodes('&', "/setrank <player> <rank>");
	
	//SPAWN
	String SPAWN_SET = ChatColor.translateAlternateColorCodes('&', "Spawnpoint set in ");
        String SPAWN = ChatColor.translateAlternateColorCodes('&', "Sent to spawn");
    	String TITLE = ChatColor.translateAlternateColorCodes('&', "&eWelcome &f");
    
    	//LOBBY ITEMS
    	String SERVER_SELECTOR_NAME = ChatColor.translateAlternateColorCodes('&', "&aServer Selector");
    
    	//DEBUG MENU
    	String MEMORY = ChatColor.translateAlternateColorCodes('&', "Free memory: &a");
    	String MAXMEM = ChatColor.translateAlternateColorCodes('&', "Maximum memory: &a");
    	String CPU = ChatColor.translateAlternateColorCodes('&', "Free processors: &a");
    	
    	//DIFFICULTY
    	String DIFFICULTY0 = ChatColor.translateAlternateColorCodes('&', "Difficulty set to &apeaceful");
    	String DIFFICULTY1 = ChatColor.translateAlternateColorCodes('&', "Difficulty set to &aeasy");
    	String DIFFICULTY2 = ChatColor.translateAlternateColorCodes('&', "Difficulty set to &anormal");
    	String DIFFICULTY3 = ChatColor.translateAlternateColorCodes('&', "Difficulty set to &ahard");
    	
    	//this thing does something
	public void setValue();

}
