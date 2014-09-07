package org.bukkit.event.block;

import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.BlockEvent;
import org.bukkit.event.block.BlockMultiPlaceEvent;
import org.bukkit.inventory.ItemStack;


public class BlockPlaceEvent extends BlockEvent implements Cancellable  {


	protected boolean cancel = false;

	protected boolean canBuild = false;

	protected Block placedAgainst = null;

	protected BlockState replacedBlockState = null;

	protected ItemStack itemInHand = null;

	protected Player player = null;

	public BlockPlaceEvent(Block placedBlock, BlockState replacedBlockState, Block placedAgainst, ItemStack itemInHand, Player thePlayer, boolean canBuild) {
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}

	public Player getPlayer() {
		return null;
	}

	public Block getBlockPlaced() {
		return null;
	}

	public BlockState getBlockReplacedState() {
		return null;
	}

	public Block getBlockAgainst() {
		return null;
	}

	public ItemStack getItemInHand() {
		return null;
	}

	public boolean canBuild() {
		return false;
	}

	public void setBuild(boolean canBuild) {
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
