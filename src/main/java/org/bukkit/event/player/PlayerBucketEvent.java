package org.bukkit.event.player;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.bukkit.event.player.PlayerBucketFillEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.ItemStack;


public abstract class PlayerBucketEvent extends PlayerEvent implements Cancellable  {


	public Material getBucket() {
		return null;
	}

	public ItemStack getItemStack() {
		return null;
	}

	public void setItemStack(ItemStack itemStack) {
	}

	public Block getBlockClicked() {
		return null;
	}

	public BlockFace getBlockFace() {
		return null;
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}
}
