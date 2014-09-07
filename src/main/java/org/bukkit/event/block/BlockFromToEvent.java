package org.bukkit.event.block;

import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.BlockEvent;


public class BlockFromToEvent extends BlockEvent implements Cancellable  {


	protected Block to = null;

	protected BlockFace face = null;

	protected boolean cancel = false;

	public BlockFromToEvent(Block block, BlockFace face) {
	}

	public BlockFromToEvent(Block block, Block toBlock) {
	}

	public BlockFace getFace() {
		return null;
	}

	public Block getToBlock() {
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
