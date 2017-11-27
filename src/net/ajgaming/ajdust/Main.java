package net.ajgaming.ajdust;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import net.ajgaming.ajdust.Commands;
import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {
	
		public void onEnable() {
			Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "-----------------------------------");
			Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "   AJGaming LostDust Plugin v1.0");
			Bukkit.getConsoleSender().sendMessage(ChatColor.WHITE + "      Created by RoboJackPlays");
			Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY +  "-----------------------------------");
			
			Bukkit.getPluginManager().registerEvents(new BlockListener(), this);
			Bukkit.getPluginManager().registerEvents(new ItemListeners(), this);
			getCommand("givedust").setExecutor(new Commands());
		}

	}

