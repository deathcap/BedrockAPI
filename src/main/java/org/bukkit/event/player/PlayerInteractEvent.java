package org.bukkit.event.player;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.ItemStack;


public class PlayerInteractEvent extends PlayerEvent implements Cancellable  {


	public Action getAction() {
		return null;
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}

	public ItemStack getItem() {
		return null;
	}

	public Material getMaterial() {
		return null;
	}

	public boolean hasBlock() {
		return false;
	}

	public boolean hasItem() {
		return false;
	}

	public boolean isBlockInHand() {
		return false;
	}

	public Block getClickedBlock() {
		return null;
	}

	public BlockFace getBlockFace() {
		return null;
	}

	public Event.Result useInteractedBlock() {
		return null;
	}

	public void setUseInteractedBlock(Event.Result useInteractedBlock) {
	}

	public Event.Result useItemInHand() {
		return null;
	}

	public void setUseItemInHand(Event.Result useItemInHand) {
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
