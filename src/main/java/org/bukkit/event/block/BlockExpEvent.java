package org.bukkit.event.block;

import org.bukkit.block.Block;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockEvent;
import org.bukkit.event.inventory.FurnaceExtractEvent;


public class BlockExpEvent extends BlockEvent  {


	public BlockExpEvent(Block block, int exp) {
	}

	public int getExpToDrop() {
		return 0;
	}

	public void setExpToDrop(int exp) {
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
