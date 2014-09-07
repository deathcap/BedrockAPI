package org.bukkit.event.entity;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;


public class EntityPortalEnterEvent extends EntityEvent  {


	public EntityPortalEnterEvent(Entity entity, Location location) {
	}

	public Location getLocation() {
		return null;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
