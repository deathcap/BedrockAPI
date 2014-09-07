package org.bukkit.event.inventory;

import java.io.Serializable;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.inventory.InventoryType.SlotType;
import java.io.Serializable;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.inventory.InventoryType.SlotType;


public enum InventoryType  {

	CHEST,
	DISPENSER,
	DROPPER,
	FURNACE,
	WORKBENCH,
	CRAFTING,
	ENCHANTING,
	BREWING,
	PLAYER,
	CREATIVE,
	MERCHANT,
	ENDER_CHEST,
	ANVIL,
	BEACON,
	HOPPER,
	;



	public int getDefaultSize() {
		return 0;
	}

	public String getDefaultTitle() {
		return null;
	}

	
	
	
	public static enum SlotType  {
	
		RESULT,
		CRAFTING,
		ARMOR,
		CONTAINER,
		QUICKBAR,
		OUTSIDE,
		FUEL,
		;
	
	
	}
}
