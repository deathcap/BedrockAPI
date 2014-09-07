package org.bukkit.inventory;

import org.bukkit.block.DoubleChest;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;


public interface DoubleChestInventory extends Inventory  {


	Inventory getLeftSide();

	Inventory getRightSide();

	DoubleChest getHolder();
}
