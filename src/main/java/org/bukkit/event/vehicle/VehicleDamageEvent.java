package org.bukkit.event.vehicle;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.vehicle.VehicleEvent;


public class VehicleDamageEvent extends VehicleEvent implements Cancellable  {


	@Deprecated public VehicleDamageEvent(Vehicle vehicle, Entity attacker, int damage) {
	}

	public VehicleDamageEvent(Vehicle vehicle, Entity attacker, double damage) {
	}

	public Entity getAttacker() {
		return null;
	}

	public double getDamage() {
		return 0.0;
	}

	@Deprecated public int _INVALID_getDamage() {
		return 0;
	}

	public void setDamage(double damage) {
	}

	@Deprecated public void _INVALID_setDamage(int damage) {
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
