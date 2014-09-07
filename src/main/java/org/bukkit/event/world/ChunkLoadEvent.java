package org.bukkit.event.world;

import org.bukkit.Chunk;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.world.ChunkEvent;
import org.bukkit.event.world.WorldEvent;


public class ChunkLoadEvent extends ChunkEvent  {


	public ChunkLoadEvent(Chunk chunk, boolean newChunk) {
        super(chunk);
	}

	public boolean isNewChunk() {
		return false;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
