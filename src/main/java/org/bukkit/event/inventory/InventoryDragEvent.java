package org.bukkit.event.inventory;

import java.util.Map;
import java.util.Set;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.inventory.DragType;
import org.bukkit.event.inventory.InventoryEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;


public class InventoryDragEvent extends InventoryInteractEvent  {


	public InventoryDragEvent(InventoryView what, ItemStack newCursor, ItemStack oldCursor, boolean right, Map<Integer,ItemStack> slots) {
	}

	public Map<Integer,ItemStack> getNewItems() {
		return null;
	}

	public Set<Integer> getRawSlots() {
		return null;
	}

	public Set<Integer> getInventorySlots() {
		return null;
	}

	public ItemStack getCursor() {
		return null;
	}

	public void setCursor(ItemStack newCursor) {
	}

	public ItemStack getOldCursor() {
		return null;
	}

	public DragType getType() {
		return null;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
