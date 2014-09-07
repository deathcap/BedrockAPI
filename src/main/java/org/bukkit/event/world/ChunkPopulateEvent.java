package org.bukkit.event.world;

import org.bukkit.Chunk;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.world.ChunkEvent;
import org.bukkit.event.world.WorldEvent;


public class ChunkPopulateEvent extends ChunkEvent  {


	public ChunkPopulateEvent(Chunk chunk) {
        super(chunk);
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
