package org.bukkit.event.block;

import org.bukkit.block.Block;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.BlockEvent;


public class BlockRedstoneEvent extends BlockEvent  {


	public int getOldCurrent() {
		return 0;
	}

	public int getNewCurrent() {
		return 0;
	}

	public void setNewCurrent(int newCurrent) {
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
