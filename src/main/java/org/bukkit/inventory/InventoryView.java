package org.bukkit.inventory;

import java.io.Serializable;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.InventoryView.Property;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView.Property;
import org.bukkit.inventory.ItemStack;


public abstract class InventoryView extends Object  {


	public static final int OUTSIDE = 0;

	public InventoryView() {
	}

	public abstract Inventory getTopInventory();

	public abstract Inventory getBottomInventory();

	public abstract HumanEntity getPlayer();

	public abstract InventoryType getType();

	public void setItem(int slot, ItemStack item) {
	}

	public ItemStack getItem(int slot) {
		return null;
	}

	public final void setCursor(ItemStack item) {
	}

	public final ItemStack getCursor() {
		return null;
	}

	public final int convertSlot(int rawSlot) {
		return 0;
	}

	public final void close() {
	}

	public final int countSlots() {
		return 0;
	}

	public final boolean setProperty(InventoryView.Property prop, int value) {
		return false;
	}

	public final String getTitle() {
		return null;
	}

	
	
	
	public static enum Property  {
	
		BREW_TIME,
		COOK_TIME,
		BURN_TIME,
		TICKS_FOR_CURRENT_FUEL,
		ENCHANT_BUTTON1,
		ENCHANT_BUTTON2,
		ENCHANT_BUTTON3,
		;
	
		public InventoryType getType() {
			return null;
		}
	
		@Deprecated public int getId() {
			return 0;
		}
	}
}
