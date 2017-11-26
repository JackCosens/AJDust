package net.ajgaming.ajdust;

import java.util.Random;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerBucketFillEvent;
import org.bukkit.event.player.PlayerShearEntityEvent;

import net.md_5.bungee.api.ChatColor;

public class BlockListener implements Listener {

    @EventHandler
    public void onPlace(BlockBreakEvent p) {
            Random rand = new Random();
            if (rand.nextInt(10000) == 1) { // (1/10000) Chance a Magical Dust is given.
    			Player player = p.getPlayer();
    			player.getInventory().addItem(Items.Magical);
    			player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "AJGaming" + ChatColor.DARK_GRAY + "] " + ChatColor.GRAY + "You have found " + ChatColor.AQUA + "1x Magical Dust" + ChatColor.GRAY + ".");
            }
    }
	
	@EventHandler
	public void onFill(PlayerBucketFillEvent f) {
		
	}
	
	@EventHandler
	public void onSheer(PlayerShearEntityEvent s) {
		
	}
	
}
