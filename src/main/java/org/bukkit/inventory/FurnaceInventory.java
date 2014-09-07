package org.bukkit.inventory;

import org.bukkit.block.Furnace;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;


public interface FurnaceInventory extends Inventory  {


	ItemStack getResult();

	ItemStack getFuel();

	ItemStack getSmelting();

	void setFuel(ItemStack stack);

	void setResult(ItemStack stack);

	void setSmelting(ItemStack stack);

	Furnace getHolder();
}
