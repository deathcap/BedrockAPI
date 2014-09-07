package org.bukkit.event.hanging;

import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Hanging;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.hanging.HangingEvent;


public class HangingPlaceEvent extends HangingEvent implements Cancellable  {


	public HangingPlaceEvent(Hanging hanging, Player player, Block block, BlockFace blockFace) {
        super(hanging);
	}

	public Player getPlayer() {
		return null;
	}

	public Block getBlock() {
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

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
