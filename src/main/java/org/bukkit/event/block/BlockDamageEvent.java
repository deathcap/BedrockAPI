package org.bukkit.event.block;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.BlockEvent;
import org.bukkit.inventory.ItemStack;


public class BlockDamageEvent extends BlockEvent implements Cancellable  {


	public BlockDamageEvent(Player player, Block block, ItemStack itemInHand, boolean instaBreak) {
	}

	public Player getPlayer() {
		return null;
	}

	public boolean getInstaBreak() {
		return false;
	}

	public void setInstaBreak(boolean bool) {
	}

	public ItemStack getItemInHand() {
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
