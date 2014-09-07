package org.bukkit.block;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.inventory.DoubleChestInventory;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;


public class DoubleChest extends Object implements InventoryHolder  {


	public Inventory getInventory() {
		return null;
	}

	public InventoryHolder getLeftSide() {
		return null;
	}

	public InventoryHolder getRightSide() {
		return null;
	}

	public Location getLocation() {
		return null;
	}

	public World getWorld() {
		return null;
	}

	public double getX() {
		return 0.0;
	}

	public double getY() {
		return 0.0;
	}

	public double getZ() {
		return 0.0;
	}
}
