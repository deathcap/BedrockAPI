package org.bukkit.event.entity;

import org.bukkit.Location;
import org.bukkit.TravelAgent;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.event.entity.EntityTeleportEvent;


public class EntityPortalEvent extends EntityTeleportEvent  {


	protected boolean useTravelAgent = false;

	protected TravelAgent travelAgent = null;

	public EntityPortalEvent(Entity entity, Location from, Location to, TravelAgent pta) {
        super(entity, from, to);
	}

	public void useTravelAgent(boolean useTravelAgent) {
	}

	public boolean useTravelAgent() {
		return false;
	}

	public TravelAgent getPortalTravelAgent() {
		return null;
	}

	public void setPortalTravelAgent(TravelAgent travelAgent) {
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
