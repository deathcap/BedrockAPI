package org.bukkit.event.world;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.world.WorldEvent;


public class SpawnChangeEvent extends WorldEvent  {


	public SpawnChangeEvent(World world, Location previousLocation) {
        super(world);
	}

	public Location getPreviousLocation() {
		return null;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
