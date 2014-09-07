package org.bukkit.event.painting;

import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Painting;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.painting.PaintingEvent;


@Deprecated public class PaintingPlaceEvent extends PaintingEvent implements Cancellable  {


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
