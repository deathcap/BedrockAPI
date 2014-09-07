package org.bukkit.event.inventory;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.event.inventory.InventoryType.SlotType;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;


public class InventoryCreativeEvent extends InventoryClickEvent  {


	public InventoryCreativeEvent(InventoryView what, InventoryType.SlotType type, int slot, ItemStack newItem) {
	}

	public ItemStack getCursor() {
		return null;
	}

	public void setCursor(ItemStack item) {
	}
}
