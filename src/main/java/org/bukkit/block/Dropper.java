package org.bukkit.block;

import org.bukkit.block.BlockState;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.metadata.Metadatable;


public interface Dropper extends BlockState, InventoryHolder  {


	void drop();
}
