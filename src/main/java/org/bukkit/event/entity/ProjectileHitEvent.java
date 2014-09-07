package org.bukkit.event.entity;

import org.bukkit.entity.Projectile;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.event.entity.ExpBottleEvent;
import org.bukkit.event.entity.PotionSplashEvent;


public class ProjectileHitEvent extends EntityEvent  {


	public ProjectileHitEvent(Projectile projectile) {
	}

	public Projectile getEntity() {
		return null;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
