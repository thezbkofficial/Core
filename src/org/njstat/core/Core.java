package org.njstat.core;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.njstat.core.commands.Announcements;
import org.njstat.core.commands.CoreCommand;
import org.njstat.core.commands.Gamemode;
import org.njstat.core.commands.SetRank;
import org.njstat.core.commands.SetSpawn;
import org.njstat.core.commands.Spawn;
import org.njstat.core.commands.msg;
import org.njstat.core.protect.Antidamage;
import org.njstat.core.protect.Antirain;
import org.njstat.core.protect.Playerjoin;
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
		registerEvents(this, new Antirain(), new Antidamage(), new Playerjoin(), new ChatFormat());
		
		this.getServer().getConsoleSender()
		.sendMessage(ChatColor.GREEN + "§7[§aCore loader§7]" + ChatColor.AQUA + " Starting up the plugin");
		this.getServer().getConsoleSender()
		.sendMessage(ChatColor.GREEN + "§7[§aCore loader§7]" + ChatColor.GREEN + " ===== " + ChatColor.RED + "COMMANDS" + ChatColor.GREEN + "=====");
		//register commands
		this.getServer().getConsoleSender()
		.sendMessage(ChatColor.GREEN + "§7[§aCore loader§7]" + ChatColor.AQUA + " Enabling core.");
		this.getCommand("core").setExecutor(new CoreCommand(this));
		this.getServer().getConsoleSender()
		.sendMessage(ChatColor.GREEN + "§7[§aCore loader§7]" + ChatColor.AQUA + " Core enabled.");
		this.getServer().getConsoleSender()
		.sendMessage(ChatColor.GREEN + "§7[§aCore loader§7]" + ChatColor.AQUA + " Enabling /spawn.");
		this.getCommand("spawn").setExecutor(new Spawn(this));
		this.getServer().getConsoleSender()
		.sendMessage(ChatColor.GREEN + "§7[§aCore loader§7]" + ChatColor.AQUA + " /spawn enabled");
		this.getServer().getConsoleSender()
		.sendMessage(ChatColor.GREEN + "§7[§aCore loader§7]" + ChatColor.AQUA + " Enabling /Setspawn.");
		this.getCommand("SetSpawn").setExecutor(new SetSpawn(this));
		this.getServer().getConsoleSender()
		.sendMessage(ChatColor.GREEN + "§7[§aCore loader§7]" + ChatColor.AQUA + " /Setspawn Enabled");
		this.getServer().getConsoleSender()
		.sendMessage(ChatColor.GREEN + "§7[§aCore loader§7]" + ChatColor.AQUA + " Enabling /gamemode.");
		//Gamemode works now kek.
		this.getCommand("gamemode").setExecutor(new Gamemode(this));
		this.getServer().getConsoleSender()
		.sendMessage(ChatColor.GREEN + "§7[§aCore loader§7]" + ChatColor.AQUA + " /gamemode Enabled");
		this.getServer().getConsoleSender()
		.sendMessage(ChatColor.GREEN + "§7[§aCore loader§7]" + ChatColor.AQUA + " Enabling /announce.");
		this.getCommand("Announce").setExecutor(new Announcements(this));
		this.getServer().getConsoleSender()
		.sendMessage(ChatColor.GREEN + "§7[§aCore loader§7]" + ChatColor.AQUA + " /announce Enabled");
		this.getServer().getConsoleSender()
		.sendMessage(ChatColor.GREEN + "§7[§aCore loader§7]" + ChatColor.AQUA + " Enabling /msg.");
		this.getCommand("msg").setExecutor(new msg(this));
		this.getServer().getConsoleSender()
		.sendMessage(ChatColor.GREEN + "§7[§aCore loader§7]" + ChatColor.AQUA + " /msg Enabled");
		this.getServer().getConsoleSender()
		.sendMessage(ChatColor.GREEN + "§7[§aCore loader§7]" + ChatColor.AQUA + " Enabling /setrank.");
		
		//Setup nicks filemanager
		this.getCommand("setrank").setExecutor(new SetRank(this));
		this.getServer().getConsoleSender()
		.sendMessage(ChatColor.GREEN + "§7[§aCore loader§7]" + ChatColor.AQUA + " /setrank Enabled");
		this.fileManager.setup(this);
		this.getServer().getConsoleSender()
		.sendMessage(ChatColor.GREEN + "§7[§aCore loader§7]" + ChatColor.AQUA + " Finished.");
		
		plugin.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
		    public void run() {
		        for (Player player: Bukkit.getOnlinePlayers()) {
		            if (player.getLocation().getY() < 9) {
		                player.performCommand("spawn");
		            }
		        }
		    }
		}, 10L, 10L);
	}
	//ondisable stuff coming soon (tm)
	@Override
	public void onDisable(){
		this.getServer().getConsoleSender()
		.sendMessage(ChatColor.GREEN + "§7[§aCore un-loader§7]" + ChatColor.AQUA + "Shutting down server.");

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
