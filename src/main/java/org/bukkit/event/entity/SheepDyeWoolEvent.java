package org.bukkit.event.entity;

import org.bukkit.DyeColor;
import org.bukkit.entity.Sheep;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;


public class SheepDyeWoolEvent extends EntityEvent implements Cancellable  {


	public SheepDyeWoolEvent(Sheep sheep, DyeColor color) {
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}

	public Sheep getEntity() {
		return null;
	}

	public DyeColor getColor() {
		return null;
	}

	public void setColor(DyeColor color) {
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
