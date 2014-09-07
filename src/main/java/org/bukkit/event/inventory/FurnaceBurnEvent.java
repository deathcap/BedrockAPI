package org.bukkit.event.inventory;

import org.bukkit.block.Block;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.BlockEvent;
import org.bukkit.inventory.ItemStack;


public class FurnaceBurnEvent extends BlockEvent implements Cancellable  {


	@Deprecated public Block getFurnace() {
		return null;
	}

	public ItemStack getFuel() {
		return null;
	}

	public int getBurnTime() {
		return 0;
	}

	public void setBurnTime(int burnTime) {
	}

	public boolean isBurning() {
		return false;
	}

	public void setBurning(boolean burning) {
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
