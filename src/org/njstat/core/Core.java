package org.njstat.core;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.njstat.core.commands.CoreCommand;
import org.njstat.core.commands.Debug;
import org.njstat.core.commands.Spawn;
import org.njstat.core.commands.msg;
import org.njstat.core.commands.staff.Announcements;
import org.njstat.core.commands.staff.DifficultyCmd;
import org.njstat.core.commands.staff.Gamemode;
import org.njstat.core.commands.staff.SetRank;
import org.njstat.core.commands.staff.SetSpawn;
import org.njstat.core.listeners.Antidamage;
import org.njstat.core.listeners.Antirain;
import org.njstat.core.listeners.FileManager;
import org.njstat.core.listeners.Playerjoin;
import org.njstat.core.listeners.Voiddamage;
import org.njstat.core.utill.ChatFormats;
import org.njstat.core.utill.api.R;
import org.njstat.core.utill.api.message;

public class Core extends JavaPlugin{
    
    FileManager fileManager = FileManager.getFileManager();

	/** OPTIONS **/
	
	public final String version = message.CORE_VERSION;
	
	
	/**         **/
	private static Plugin plugin;
	@Override
	public void onEnable(){
		plugin = this;
		//Register Listeners
		registerEvents(this, new Antirain(), new Antidamage(), new Playerjoin(), new ChatFormats(), new Voiddamage());
		
		//register commands
		
		this.getCommand("core").setExecutor(new CoreCommand(this));
		this.getCommand("difficulty").setExecutor(new DifficultyCmd(this));
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
		.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7[&aCore&7] &bFinished loading"));
		
		
		
	}

	//ondisable stuff coming soon (tm)
	@Override
	public void onDisable(){
		for(Player p : Bukkit.getOnlinePlayers()){
			 
            if(p.isOp() || R.isAdmin(p) || R.isOwner(p) || R.isDev(p)){
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lALERT &4This plugin does NOT handle relods properly and may cause memory leaks!"));
            }
 
        }
		this.getServer().getConsoleSender()
		.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7[&aCore&7] &bbyebye"));

	}
	
	public static void registerEvents(org.bukkit.plugin.Plugin plugin, Listener... listeners) {
		for (Listener listener : listeners) {
		Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
		}
	}
	
	public static Plugin getPlugin() {
		return plugin;
	}
}
