package org.bukkit.inventory;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;


public interface EnchantingInventory extends Inventory  {


	void setItem(ItemStack item);

	ItemStack getItem();
}
