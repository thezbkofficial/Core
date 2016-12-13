package org.njstat.core.protect;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_11_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import net.minecraft.server.v1_11_R1.IChatBaseComponent.ChatSerializer;
import net.minecraft.server.v1_11_R1.PacketPlayOutTitle;
import net.minecraft.server.v1_11_R1.PacketPlayOutTitle.EnumTitleAction;

public class Playerjoin implements Listener{
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		//Stupid join message
		Bukkit.broadcastMessage("§7[§a+§7] " + event.getPlayer().getDisplayName());
		
        event.setJoinMessage(null);
		Player p = event.getPlayer();
		
		
		
		Material material = Material.STICK;
		final PlayerInventory inventory = event.getPlayer().getInventory();
	  	inventory.setArmorContents(null);
	  	inventory.clear();
        int ammount = 1;
        String name = "§aServer Selector";
        ItemStack item = new ItemStack(material, ammount);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName(name);
 
        itemMeta.setLore(Arrays.asList(""));
 
        item.setItemMeta(itemMeta);
        p.getInventory().addItem(item);
        //MOTD
        String motd = "\n"
        		+ "§6§lZbkGames Network §7- §a " + Bukkit.getServer().getOnlinePlayers().size() + "§7 players online\n"
        		+ "\n";
        p.sendMessage(motd);
        PacketPlayOutTitle packet = new PacketPlayOutTitle(EnumTitleAction.TITLE, ChatSerializer.a("{\"text\":\"§eWelcome " + p.getName() + "\"}"), 20, 40, 20);
        PacketPlayOutTitle packet1 = new PacketPlayOutTitle(EnumTitleAction.SUBTITLE, ChatSerializer.a("{\"text\":\"§fTo zbkGames!\"}"), 20, 40, 20);

        ((CraftPlayer) event.getPlayer()).getHandle().playerConnection.sendPacket(packet);
        ((CraftPlayer) event.getPlayer()).getHandle().playerConnection.sendPacket(packet1);
    }

}
