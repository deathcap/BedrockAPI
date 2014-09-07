package org.bukkit.event.entity;

import org.bukkit.entity.Sheep;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;


public class SheepRegrowWoolEvent extends EntityEvent implements Cancellable  {


	public SheepRegrowWoolEvent(Sheep sheep) {
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}

	public Sheep getEntity() {
		return null;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
