package org.bukkit.event.vehicle;

import org.bukkit.entity.Vehicle;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.vehicle.VehicleEvent;


public class VehicleUpdateEvent extends VehicleEvent  {


	public VehicleUpdateEvent(Vehicle vehicle) {
        super(vehicle);
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
