package org.bukkit.event.entity;

import org.bukkit.entity.Horse;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;


public class HorseJumpEvent extends EntityEvent implements Cancellable  {


	public HorseJumpEvent(Horse horse, float power) {
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}

	public Horse getEntity() {
		return null;
	}

	public float getPower() {
		return 0.0f;
	}

	public void setPower(float power) {
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
