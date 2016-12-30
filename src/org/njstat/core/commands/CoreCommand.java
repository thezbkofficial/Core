package org.njstat.core.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.njstat.core.Core;
import org.njstat.core.utill.api.R;
import org.njstat.core.utill.api.message;
import org.njstat.core.utill.api.prefix;

public class CoreCommand implements CommandExecutor{
	
	Core plugin;
	public CoreCommand(Core passedPlugin){
		this.plugin = passedPlugin;
	}
	
	String version = "beta-1";

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		Player p = (Player) sender;
		p.sendMessage(prefix.CORE + message.CORE + message.CORE_VERSION);
		if(!R.isDefault(p)){
			p.sendMessage(prefix.RANKS + message.CORE_IS_STAFF);
		}
		return true;
	}
}
