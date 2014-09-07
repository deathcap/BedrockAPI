package org.bukkit.event.entity;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Explosive;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;


public class ExplosionPrimeEvent extends EntityEvent implements Cancellable  {


	public ExplosionPrimeEvent(Entity what, float radius, boolean fire) {
	}

	public ExplosionPrimeEvent(Explosive explosive) {
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}

	public float getRadius() {
		return 0.0f;
	}

	public void setRadius(float radius) {
	}

	public boolean getFire() {
		return false;
	}

	public void setFire(boolean fire) {
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
