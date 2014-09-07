package org.bukkit.block;

import org.bukkit.block.BlockState;
import org.bukkit.block.ContainerBlock;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.metadata.Metadatable;
import org.bukkit.projectiles.BlockProjectileSource;


public interface Dispenser extends BlockState, ContainerBlock  {


	BlockProjectileSource getBlockProjectileSource();

	boolean dispense();
}
