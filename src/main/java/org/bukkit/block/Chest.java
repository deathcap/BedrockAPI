package org.bukkit.block;

import org.bukkit.block.BlockState;
import org.bukkit.block.ContainerBlock;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.metadata.Metadatable;


public interface Chest extends BlockState, ContainerBlock  {


	Inventory getBlockInventory();
}
