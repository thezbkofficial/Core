package org.njstat.core.util;

import org.bukkit.ChatColor;

public interface ChatFormat {
	
	String OWNER = ChatColor.translateAlternateColorCodes('&', "&4&lOWNER &e%s &f%s");
	String DEV = ChatColor.translateAlternateColorCodes('&', "&4&lDEV &e%s &f%s");
	String ADMIN = ChatColor.translateAlternateColorCodes('&', "&c&lADMIN &e%s &f%s");
	String BUILDER = ChatColor.translateAlternateColorCodes('&', "&9&lBUILDER &e%s &f%s");
	String MOD = ChatColor.translateAlternateColorCodes('&', "&6&lMOD &e%s &f%s");
	
	String DEFAULT = ChatColor.translateAlternateColorCodes('&', "&e%s &f%s");
	
	public void setValue();

}
