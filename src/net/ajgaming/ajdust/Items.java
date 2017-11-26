package net.ajgaming.ajdust;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Items {
	
    public static ItemStack CreateItem(String name, Material itemM, List<String> lore, int data) {

        ItemStack item = new ItemStack(itemM, 1, (byte) data);
        ItemMeta im = item.getItemMeta();

        im.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));

        List<String> l = new ArrayList<String>();
        if (lore != null) {
            for (String s : lore) {
                l.add(ChatColor.translateAlternateColorCodes('&', s));
            }

            im.setLore(l);
        }
        item.setItemMeta(im);

        return item;
    }

	
	
    public static ItemStack Magical = new ItemStack(CreateItem("&dMagical Dust", Material.RECORD_11, null, 0));
}