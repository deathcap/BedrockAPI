package org.bukkit.event.entity;

import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Projectile;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.inventory.ItemStack;


public class EntityShootBowEvent extends EntityEvent implements Cancellable  {


	public EntityShootBowEvent(LivingEntity shooter, ItemStack bow, Projectile projectile, float force) {
	}

	public LivingEntity getEntity() {
		return null;
	}

	public ItemStack getBow() {
		return null;
	}

	public Entity getProjectile() {
		return null;
	}

	public void setProjectile(Entity projectile) {
	}

	public float getForce() {
		return 0.0f;
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
