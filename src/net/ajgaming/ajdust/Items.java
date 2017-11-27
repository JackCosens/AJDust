package net.ajgaming.ajdust;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class Items {
	
public static void giveMagical(Player player){
	
	ItemStack magical = new ItemStack(Material.RECORD_11);
	ItemMeta magicalmeta = magical.getItemMeta();
	
	magicalmeta.addEnchant(Enchantment.DURABILITY, 10, true);
	magicalmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
	magicalmeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Magical Dust");
	ArrayList<String> magicallore = new ArrayList<>();
	magicallore.add(ChatColor.LIGHT_PURPLE + "ULTRA RARE");
	magicalmeta.setLore(magicallore);
	magical.setItemMeta(magicalmeta);
	
	player.getInventory().addItem(magical);
	
	
    }

public static void giveEtheral(Player player){
	
	ItemStack etheral = new ItemStack(Material.GOLD_RECORD);
	ItemMeta etheralmeta = etheral.getItemMeta();
	
	etheralmeta.addEnchant(Enchantment.DURABILITY, 10, true);
	etheralmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
	etheralmeta.setDisplayName(ChatColor.GREEN + "Etheral Dust");
	ArrayList<String> etherallore = new ArrayList<>();
	etherallore.add(ChatColor.GREEN + "RARE");
	etheralmeta.setLore(etherallore);
	etheral.setItemMeta(etheralmeta);
	
	player.getInventory().addItem(etheral);
	
    }

public static void giveSpectral(Player player){
	
	ItemStack spectral = new ItemStack(Material.RECORD_8);
	ItemMeta spectralmeta = spectral.getItemMeta();
	
	spectralmeta.addEnchant(Enchantment.DURABILITY, 10, true);
	spectralmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
	spectralmeta.setDisplayName(ChatColor.AQUA + "Spectral Dust");
	ArrayList<String> spectrallore = new ArrayList<>();
	spectrallore.add(ChatColor.AQUA + "COMMON");
	spectralmeta.setLore(spectrallore);
	spectral.setItemMeta(spectralmeta);
	
	player.getInventory().addItem(spectral);
	
    }

public static String colorize(String msg) {
	String coloredMsg = "";
	for (int i = 0; i < msg.length(); i++) {
		if (msg.charAt(i) == '&')
			coloredMsg += '§';
		else
			coloredMsg += msg.charAt(i);
	}
	return coloredMsg;
}

public static void giveRainbow(Player player){
	
	ItemStack rainbow = new ItemStack(Material.GREEN_RECORD);
	ItemMeta rainbowmeta = rainbow.getItemMeta();
	
	rainbowmeta.setDisplayName(ChatColor.AQUA + colorize("&aR&ba&ci&dn&eb&5o&3w &4D&au&bs&et"));
	ArrayList<String> rainbowlore = new ArrayList<>();
	rainbowlore.add(ChatColor.GRAY + "Right click for a wonderful time!");
	rainbowmeta.setLore(rainbowlore);
	rainbow.setItemMeta(rainbowmeta);
	
	player.getInventory().addItem(rainbow);
	
    }

public static void removeRainbow(Player player){
	
	ItemStack rainbow = new ItemStack(Material.GREEN_RECORD);
	ItemMeta rainbowmeta = rainbow.getItemMeta();
	
	rainbowmeta.setDisplayName(ChatColor.AQUA + colorize("&aR&ba&ci&dn&eb&5o&3w &4D&au&bs&et"));
	ArrayList<String> rainbowlore = new ArrayList<>();
	rainbowlore.add(ChatColor.GRAY + "Right click for a wonderful time!");
	rainbowmeta.setLore(rainbowlore);
	rainbow.setItemMeta(rainbowmeta);
	
	player.getInventory().removeItem(rainbow);
	
    }


public static void givePack(Player player){
	
	ItemStack pack = new ItemStack(Material.RECORD_12);
	ItemMeta packmeta = pack.getItemMeta();
	
	packmeta.setDisplayName(ChatColor.AQUA + "Ender Backpack");
	pack.setItemMeta(packmeta);
	
	player.getInventory().addItem(pack);
	
    }
}