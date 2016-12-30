package org.njstat.core.listeners;



/*

******* ADD
this.fileManager.setup(this);

IN  YER ONENABLE OR FILEMANAGER WONT WORK

*/


import java.io.File;
import java.io.IOException;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

public class FileManager {
	
	Plugin plugin;
	FileConfiguration rankConfig;
	File rankFile;
	static FileManager fileManager = new FileManager();

	public static FileManager getFileManager() {
		return fileManager;
	}

	public void setup(Plugin plugin) {
		if (!plugin.getDataFolder().exists()) {
			plugin.getDataFolder().mkdir();
		}
		this.rankFile = new File(plugin.getDataFolder(), "ranks.yml");
		if (!this.rankFile.exists()) {
			try {
				this.rankFile.createNewFile();
			} catch (IOException e) {
				Bukkit.getServer().getLogger().severe("===== COULD NOT GENERATE rankS.YML ==== ");

				e.printStackTrace();

				Bukkit.getServer().getLogger().severe("===== END OF STACKTRACE =====");
			}
		}
		this.rankConfig = YamlConfiguration.loadConfiguration(this.rankFile);
	}

	public FileConfiguration getrankConfig() {
		return this.rankConfig;
	}

	public void saverankConfig() {
		try {
			this.rankConfig.save(this.rankFile);
		} catch (IOException e) {
			Bukkit.getServer().getLogger().severe("===== COULD NOT SAVE rankS.YML =====");

			e.printStackTrace();

			Bukkit.getServer().getLogger().severe("===== END OF STACKTRACE =====");
		}
	}

	public void reloadrankConfig() {
		this.rankConfig = YamlConfiguration.loadConfiguration(this.rankFile);
	}
}