package org.bukkit.event.inventory;

import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.inventory.InventoryEvent;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.Recipe;


public class PrepareItemCraftEvent extends InventoryEvent  {


	public PrepareItemCraftEvent(CraftingInventory what, InventoryView view, boolean isRepair) {
	}

	public Recipe getRecipe() {
		return null;
	}

	public CraftingInventory getInventory() {
		return null;
	}

	public boolean isRepair() {
		return false;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
