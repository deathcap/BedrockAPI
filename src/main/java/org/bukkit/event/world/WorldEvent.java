package org.bukkit.event.world;

import org.bukkit.World;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.world.ChunkEvent;
import org.bukkit.event.world.PortalCreateEvent;
import org.bukkit.event.world.SpawnChangeEvent;
import org.bukkit.event.world.StructureGrowEvent;
import org.bukkit.event.world.WorldInitEvent;
import org.bukkit.event.world.WorldLoadEvent;
import org.bukkit.event.world.WorldSaveEvent;
import org.bukkit.event.world.WorldUnloadEvent;


public abstract class WorldEvent extends Event  {


	public WorldEvent(World world) {
	}

	public World getWorld() {
		return null;
	}
}
