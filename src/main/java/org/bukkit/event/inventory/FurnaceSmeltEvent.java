package org.bukkit.event.inventory;

import org.bukkit.block.Block;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.BlockEvent;
import org.bukkit.inventory.ItemStack;


public class FurnaceSmeltEvent extends BlockEvent implements Cancellable  {


	public FurnaceSmeltEvent(Block furnace, ItemStack source, ItemStack result) {
	}

	@Deprecated public Block getFurnace() {
		return null;
	}

	public ItemStack getSource() {
		return null;
	}

	public ItemStack getResult() {
		return null;
	}

	public void setResult(ItemStack result) {
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
