package org.njstat.core.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.njstat.core.Core;
import org.njstat.core.utill.api.message;
import org.njstat.core.utill.api.prefix;

public class Spawn implements CommandExecutor{
	Core plugin;
	public Spawn(Core passedPlugin){
		this.plugin = passedPlugin;
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		Player p = (Player) sender;
		p.teleport(p.getWorld().getSpawnLocation());
        p.sendMessage(prefix.SPAWN + message.SPAWN);
		return true;
	}
}
