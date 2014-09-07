package org.bukkit.event.world;

import org.bukkit.Chunk;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.world.ChunkLoadEvent;
import org.bukkit.event.world.ChunkPopulateEvent;
import org.bukkit.event.world.ChunkUnloadEvent;
import org.bukkit.event.world.WorldEvent;


public abstract class ChunkEvent extends WorldEvent  {


	public Chunk getChunk() {
		return null;
	}
}
