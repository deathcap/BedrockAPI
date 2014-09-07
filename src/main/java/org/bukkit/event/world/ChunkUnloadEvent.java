package org.bukkit.event.world;

import org.bukkit.Chunk;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.world.ChunkEvent;
import org.bukkit.event.world.WorldEvent;


public class ChunkUnloadEvent extends ChunkEvent implements Cancellable  {


	public ChunkUnloadEvent(Chunk chunk) {
        super(chunk);
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
