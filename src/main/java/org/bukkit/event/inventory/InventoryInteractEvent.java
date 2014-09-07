package org.bukkit.event.inventory;

import org.bukkit.entity.HumanEntity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.inventory.InventoryEvent;
import org.bukkit.inventory.InventoryView;


public abstract class InventoryInteractEvent extends InventoryEvent implements Cancellable  {


	public InventoryInteractEvent(InventoryView transaction) {
	}

	public HumanEntity getWhoClicked() {
		return null;
	}

	public void setResult(Event.Result newResult) {
	}

	public Event.Result getResult() {
		return null;
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean toCancel) {
	}
}
