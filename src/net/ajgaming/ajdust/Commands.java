package net.ajgaming.ajdust;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import net.ajgaming.ajdust.Items;
import net.md_5.bungee.api.ChatColor;


public class Commands implements CommandExecutor{
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] arg) {
		// TODO Auto-generated method stub
		if (sender instanceof Player) {
			Player player = (Player) sender;
			
			player.getInventory().addItem(Items.Magical);
			
		} else {
			sender.sendMessage(ChatColor.RED + "Only players can run this command!");
		}
		
		return false;
	}

}
