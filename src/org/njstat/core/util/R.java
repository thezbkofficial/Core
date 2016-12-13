package org.njstat.core.util;

import org.bukkit.entity.Player;

public class R {
	static FileManager fileManager = FileManager.getFileManager();

	public static boolean isOwner(Player player){
		return fileManager.getrankConfig().getBoolean("groups.owner.users." + player.getUniqueId().toString());
	}
	public static boolean isDev(Player player){
		return fileManager.getrankConfig().getBoolean("groups.dev.users." + player.getUniqueId().toString());
	}
	public static boolean isAdmin(Player player){
		return fileManager.getrankConfig().getBoolean("groups.admin.users." + player.getUniqueId().toString());
	}
	public static boolean isMod(Player player){
		return fileManager.getrankConfig().getBoolean("groups.moderator.users." + player.getUniqueId().toString());
	}
	public static boolean isDefault(Player player){
		return fileManager.getrankConfig().getBoolean("groups.default.users." + player.getUniqueId().toString());
	}
	public static boolean isBuilder(Player player){
		return fileManager.getrankConfig().getBoolean("groups.builder.users." + player.getUniqueId().toString());
	}
}
