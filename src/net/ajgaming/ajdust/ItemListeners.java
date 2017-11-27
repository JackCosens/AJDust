package net.ajgaming.ajdust;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

public class ItemListeners implements Listener {
	
	private Main plugin = Main.getPlugin(Main.class);
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onClick(PlayerInteractEvent i) {
	    Player player = i.getPlayer();
	    
	    ItemStack item = player.getItemInHand();
	    if(item.getType().equals(Material.RECORD_12)) {
	    	player.getServer().dispatchCommand(player.getServer().getConsoleSender(), "lp user " + player.getName() + " permission set CustomEnderChest.commands true server=lost");
	    	player.getServer().dispatchCommand(player, "customec open");
			new BukkitRunnable() {
				@Override
				public void run() {
					player.getServer().dispatchCommand(player.getServer().getConsoleSender(), "lp user " + player.getName() + " permission unset CustomEnderChest.commands server=lost");	
				}
			}.runTaskLater(plugin, 20L);
	    } else if(item.getType().equals(Material.GREEN_RECORD)) {
	    	player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, (int) 600L, 10), true);
	    	player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, (int) 600L, 6), true);
	    	player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, (int) 400L, 6), true);
	    	Items.removeRainbow(player);
	    	i.setCancelled(true);
	    			
	    		}
	    	}

	    
	}
	

