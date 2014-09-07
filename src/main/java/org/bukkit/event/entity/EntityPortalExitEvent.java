package org.bukkit.event.entity;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.event.entity.EntityTeleportEvent;
import org.bukkit.util.Vector;


public class EntityPortalExitEvent extends EntityTeleportEvent  {


	public Vector getBefore() {
		return null;
	}

	public Vector getAfter() {
		return null;
	}

	public void setAfter(Vector after) {
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
