package org.bukkit.event.vehicle;

import org.bukkit.block.Block;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.vehicle.VehicleCollisionEvent;
import org.bukkit.event.vehicle.VehicleEvent;


public class VehicleBlockCollisionEvent extends VehicleCollisionEvent  {


	public VehicleBlockCollisionEvent(Vehicle vehicle, Block block) {
        super(vehicle);
	}

	public Block getBlock() {
		return null;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
