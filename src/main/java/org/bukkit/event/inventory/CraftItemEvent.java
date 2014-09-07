package org.bukkit.event.inventory;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.event.inventory.InventoryType.SlotType;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.Recipe;


public class CraftItemEvent extends InventoryClickEvent  {


	@Deprecated public CraftItemEvent(Recipe recipe, InventoryView what, InventoryType.SlotType type, int slot, boolean right, boolean shift) {
        super(what, type, slot, right, shift);
	}

	public CraftItemEvent(Recipe recipe, InventoryView what, InventoryType.SlotType type, int slot, ClickType click, InventoryAction action) {
        super(what, type, slot, false, false);
	}

	public CraftItemEvent(Recipe recipe, InventoryView what, InventoryType.SlotType type, int slot, ClickType click, InventoryAction action, int key) {
        super(what, type, slot, false, false);
	}

	public Recipe getRecipe() {
		return null;
	}

	public CraftingInventory getInventory() {
		return null;
	}
}
