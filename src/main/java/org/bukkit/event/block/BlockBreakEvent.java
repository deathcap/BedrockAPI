package org.bukkit.event.block;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.block.BlockEvent;
import org.bukkit.event.block.BlockExpEvent;


public class BlockBreakEvent extends BlockExpEvent implements Cancellable  {


	public BlockBreakEvent(Block theBlock, Player player) {
	}

	public Player getPlayer() {
		return null;
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}
}
