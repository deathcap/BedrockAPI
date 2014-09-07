package org.bukkit.event.inventory;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;


public class InventoryMoveItemEvent extends Event implements Cancellable  {


	public InventoryMoveItemEvent(Inventory sourceInventory, ItemStack itemStack, Inventory destinationInventory, boolean didSourceInitiate) {
	}

	public Inventory getSource() {
		return null;
	}

	public ItemStack getItem() {
		return null;
	}

	public void setItem(ItemStack itemStack) {
	}

	public Inventory getDestination() {
		return null;
	}

	public Inventory getInitiator() {
		return null;
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
