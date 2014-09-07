package org.bukkit.block;

import org.bukkit.block.BlockState;
import org.bukkit.block.ContainerBlock;
import org.bukkit.inventory.BrewerInventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.metadata.Metadatable;


public interface BrewingStand extends BlockState, ContainerBlock  {


	int getBrewingTime();

	void setBrewingTime(int brewTime);

	BrewerInventory getInventory();
}
