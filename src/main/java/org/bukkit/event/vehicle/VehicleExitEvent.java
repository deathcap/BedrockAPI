package org.bukkit.event.vehicle;

import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.vehicle.VehicleEvent;


public class VehicleExitEvent extends VehicleEvent implements Cancellable  {


	public VehicleExitEvent(Vehicle vehicle, LivingEntity exited) {
        super(vehicle);
	}

	public LivingEntity getExited() {
		return null;
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
