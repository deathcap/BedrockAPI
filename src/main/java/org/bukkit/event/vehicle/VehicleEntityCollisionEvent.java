package org.bukkit.event.vehicle;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.vehicle.VehicleCollisionEvent;
import org.bukkit.event.vehicle.VehicleEvent;


public class VehicleEntityCollisionEvent extends VehicleCollisionEvent implements Cancellable  {


	public Entity getEntity() {
		return null;
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}

	public boolean isPickupCancelled() {
		return false;
	}

	public void setPickupCancelled(boolean cancel) {
	}

	public boolean isCollisionCancelled() {
		return false;
	}

	public void setCollisionCancelled(boolean cancel) {
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
