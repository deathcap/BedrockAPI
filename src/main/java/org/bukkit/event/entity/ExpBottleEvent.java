package org.bukkit.event.entity;

import org.bukkit.entity.ThrownExpBottle;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.event.entity.ProjectileHitEvent;


public class ExpBottleEvent extends ProjectileHitEvent  {


	public ThrownExpBottle getEntity() {
		return null;
	}

	public boolean getShowEffect() {
		return false;
	}

	public void setShowEffect(boolean showEffect) {
	}

	public int getExperience() {
		return 0;
	}

	public void setExperience(int exp) {
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
