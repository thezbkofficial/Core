package org.njstat.core;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.njstat.core.commands.Announcements;
import org.njstat.core.commands.CoreCommand;
import org.njstat.core.commands.Debug;
import org.njstat.core.commands.Gamemode;
import org.njstat.core.commands.SetRank;
import org.njstat.core.commands.SetSpawn;
import org.njstat.core.commands.Spawn;
import org.njstat.core.commands.msg;
import org.njstat.core.listeners.Antidamage;
import org.njstat.core.listeners.Antirain;
import org.njstat.core.listeners.Playerjoin;
import org.njstat.core.listeners.Voiddamage;
import org.njstat.core.util.FileManager;

public class Core extends JavaPlugin{
    
    FileManager fileManager = FileManager.getFileManager();

	/** OPTIONS **/
	
	public final String version = "beta2-build7";
	
	
	/**         **/
	private static Plugin plugin;
	@Override
	public void onEnable(){
		plugin = this;
		//Register Listeners
		registerEvents(this, new Antirain(), new Antidamage(), new Playerjoin(), new ChatFormats(), new Voiddamage());
		
		//register commands
		
		this.getCommand("core").setExecutor(new CoreCommand(this));
		this.getCommand("spawn").setExecutor(new Spawn(this));
		this.getCommand("SetSpawn").setExecutor(new SetSpawn(this));
		this.getCommand("gamemode").setExecutor(new Gamemode(this));
		this.getCommand("Announce").setExecutor(new Announcements(this));
		this.getCommand("msg").setExecutor(new msg(this));
		this.getCommand("setrank").setExecutor(new SetRank(this));
		this.getCommand("lag").setExecutor(new Debug(this));

		//FileManager
		this.fileManager.setup(this);
		
		this.getServer().getConsoleSender()
		.sendMessage(ChatColor.GREEN + "§7[§aCore loader§7]" + ChatColor.AQUA + " Finished.");
		
		
		
	}

	//ondisable stuff coming soon (tm)
	@Override
	public void onDisable(){
		this.getServer().getConsoleSender()
		.sendMessage(ChatColor.GREEN + "§7[§aCore un-loader§7]" + ChatColor.AQUA + " Shutting down server.");

	}
	
	public static void registerEvents(org.bukkit.plugin.Plugin plugin, Listener... listeners) {
		for (Listener listener : listeners) {
		Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
		}
	}
	
	public static Plugin getPlugin() {
		return plugin;
	}

	//Id like to thank my mom for plenty of memes
	// speech over
	

	
	
	
	

}
