package org.bukkit.event.vehicle;

import org.bukkit.Location;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.vehicle.VehicleEvent;


public class VehicleMoveEvent extends VehicleEvent  {


	public VehicleMoveEvent(Vehicle vehicle, Location from, Location to) {
	}

	public Location getFrom() {
		return null;
	}

	public Location getTo() {
		return null;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
