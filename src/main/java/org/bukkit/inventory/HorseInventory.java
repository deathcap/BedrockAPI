package org.bukkit.inventory;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;


public interface HorseInventory extends Inventory  {


	ItemStack getSaddle();

	ItemStack getArmor();

	void setSaddle(ItemStack stack);

	void setArmor(ItemStack stack);
}
