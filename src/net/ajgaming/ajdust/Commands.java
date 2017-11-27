package net.ajgaming.ajdust;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import net.ajgaming.ajdust.Items;
import net.md_5.bungee.api.ChatColor;


public class Commands implements CommandExecutor{
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			
			if (!player.hasPermission("skyblock.givedust")) {
				player.sendMessage(ChatColor.RED + "You do not have permission for that command!");
		} else {
			switch(args[0].toLowerCase()){
			case "magical":
				player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "AJGaming" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY + "You have been given " + ChatColor.AQUA + "1x Magical Dust" + ChatColor.GRAY + ".");
				Items.giveMagical(player);
				break;
			case "etheral":
				player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "AJGaming" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY + "You have been given " + ChatColor.AQUA + "1x Etheral Dust" + ChatColor.GRAY + ".");
				Items.giveEtheral(player);
				break;
			case "spectral":
				player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "AJGaming" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY + "You have been given " + ChatColor.AQUA + "1x Spectral Dust" + ChatColor.GRAY + ".");
				Items.giveSpectral(player);
				break;
			case "enderpack":
				player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "AJGaming" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY + "You have been given " + ChatColor.AQUA + "1x Ender Backpack" + ChatColor.GRAY + ".");
				Items.givePack(player);
				break;
			case "rainbow":
				player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "AJGaming" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY + "You have been given " + ChatColor.AQUA + "1x Rainbow Dust" + ChatColor.GRAY + ".");
				Items.giveRainbow(player);
				break;
			default:
				player.sendMessage("Please specify a argument");
				break;		
			}
		}
		} else {
			sender.sendMessage(ChatColor.RED + "Only players can run this command!");
		}
		
		return true;
	}
		}
