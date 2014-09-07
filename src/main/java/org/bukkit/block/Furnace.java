package org.bukkit.block;

import org.bukkit.block.BlockState;
import org.bukkit.block.ContainerBlock;
import org.bukkit.inventory.FurnaceInventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.metadata.Metadatable;


public interface Furnace extends BlockState, ContainerBlock  {


	short getBurnTime();

	void setBurnTime(short burnTime);

	short getCookTime();

	void setCookTime(short cookTime);

	FurnaceInventory getInventory();
}
