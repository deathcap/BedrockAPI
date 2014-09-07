package org.bukkit.event.inventory;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryCreativeEvent;
import org.bukkit.event.inventory.InventoryEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.event.inventory.InventoryType.SlotType;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;


public class InventoryClickEvent extends InventoryInteractEvent  {


	@Deprecated public InventoryClickEvent(InventoryView view, InventoryType.SlotType type, int slot, boolean right, boolean shift) {
        super(view);
	}

	public InventoryClickEvent(InventoryView view, InventoryType.SlotType type, int slot, ClickType click, InventoryAction action) {
        super(view);
	}

	public InventoryClickEvent(InventoryView view, InventoryType.SlotType type, int slot, ClickType click, InventoryAction action, int key) {
        super(view);
	}

	public InventoryType.SlotType getSlotType() {
		return null;
	}

	public ItemStack getCursor() {
		return null;
	}

	public ItemStack getCurrentItem() {
		return null;
	}

	public boolean isRightClick() {
		return false;
	}

	public boolean isLeftClick() {
		return false;
	}

	public boolean isShiftClick() {
		return false;
	}

	@Deprecated public void setCursor(ItemStack stack) {
	}

	public void setCurrentItem(ItemStack stack) {
	}

	public int getSlot() {
		return 0;
	}

	public int getRawSlot() {
		return 0;
	}

	public int getHotbarButton() {
		return 0;
	}

	public InventoryAction getAction() {
		return null;
	}

	public ClickType getClick() {
		return null;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
