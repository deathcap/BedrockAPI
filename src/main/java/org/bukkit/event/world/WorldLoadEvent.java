package org.bukkit.event.world;

import org.bukkit.World;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.world.WorldEvent;


public class WorldLoadEvent extends WorldEvent  {


	public WorldLoadEvent(World world) {
        super(world);
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
