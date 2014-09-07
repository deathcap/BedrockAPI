package org.bukkit.inventory;

import org.bukkit.block.BrewingStand;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;


public interface BrewerInventory extends Inventory  {


	ItemStack getIngredient();

	void setIngredient(ItemStack ingredient);

	BrewingStand getHolder();
}
