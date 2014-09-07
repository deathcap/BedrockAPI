package org.bukkit.event.block;

import org.bukkit.block.Block;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.BlockEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;


public class BlockDispenseEvent extends BlockEvent implements Cancellable  {


	public ItemStack getItem() {
		return null;
	}

	public void setItem(ItemStack item) {
	}

	public Vector getVelocity() {
		return null;
	}

	public void setVelocity(Vector vel) {
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
