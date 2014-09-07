package org.bukkit.event.inventory;

import java.util.List;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.enchantment.PrepareItemEnchantEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;


public class InventoryEvent extends Event  {


	protected InventoryView transaction = null;

    public InventoryEvent() {
        // TODO
    }

	public InventoryEvent(InventoryView transaction) {
	}

	public Inventory getInventory() {
		return null;
	}

	public List<HumanEntity> getViewers() {
		return null;
	}

	public InventoryView getView() {
		return null;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
