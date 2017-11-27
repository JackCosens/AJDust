package net.ajgaming.ajdust;

import java.util.Random;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerBucketFillEvent;
import org.bukkit.event.player.PlayerShearEntityEvent;

import net.md_5.bungee.api.ChatColor;

public class BlockListener implements Listener {

	
    @EventHandler
    public void onPlace(BlockBreakEvent p) {
            Random rand = new Random();
            if (rand.nextInt(10000) == 1) { // (1/10000) Chance a Magical Dust is given.
    			Player player = p.getPlayer();
    			Items.giveMagical(player);
    			player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "AJGaming" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY + "You have found " + ChatColor.AQUA + "1x Magical Dust" + ChatColor.GRAY + ".");
            } else if(rand.nextInt(1000) == 1) {
    			Player player = p.getPlayer();
    			Items.giveEtheral(player);
    			player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "AJGaming" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY + "You have found " + ChatColor.AQUA + "1x Etheral Dust" + ChatColor.GRAY + ".");
            } else if(rand.nextInt(600) == 1) {
            	Player player = p.getPlayer();
            	Items.giveSpectral(player);
            	player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "AJGaming" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY + "You have found " + ChatColor.AQUA + "1x Spectral Dust" + ChatColor.GRAY + ".");
            }
    }
	
	@EventHandler
	public void onFill(PlayerBucketFillEvent f) {
        Random rand = new Random();
		if (rand.nextInt(400) == 1) {
			Player player = f.getPlayer();
			Items.giveSpectral(player);
			player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "AJGaming" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY + "You have found " + ChatColor.AQUA + "1x Spectral Dust" + ChatColor.GRAY + ".");
	}
	}
	
	@EventHandler
	public void onSheer(PlayerShearEntityEvent s) {
        Random rand = new Random();
		if (rand.nextInt(400) == 1) {
			Player player = s.getPlayer();
			Items.giveSpectral(player);
			player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "AJGaming" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY + "You have found " + ChatColor.AQUA + "1x Spectral Dust" + ChatColor.GRAY + ".");
	}
	}
		
	@EventHandler
	public void onMobKill(EntityDeathEvent d) {
		Random rand = new Random();
		if(!(d.getEntity() instanceof Player)) {
			if (d.getEntity().getKiller() instanceof Player){
				Player player = d.getEntity().getKiller();
				if (rand.nextInt(500) == 1) {
					Items.giveSpectral(player);
					player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "AJGaming" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY + "You have found " + ChatColor.AQUA + "1x Spectral Dust" + ChatColor.GRAY + ".");
					
				}
			}
			
		}
	}
}
