package org.bukkit.event.entity;

import java.util.Collection;
import java.util.Map;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.ThrownPotion;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.event.entity.ProjectileHitEvent;


public class PotionSplashEvent extends ProjectileHitEvent implements Cancellable  {


	public PotionSplashEvent(ThrownPotion potion, Map<LivingEntity,Double> affectedEntities) {
        super(potion);
	}

	public ThrownPotion getEntity() {
		return null;
	}

	public ThrownPotion getPotion() {
		return null;
	}

	public Collection<LivingEntity> getAffectedEntities() {
		return null;
	}

	public double getIntensity(LivingEntity entity) {
		return 0.0;
	}

	public void setIntensity(LivingEntity entity, double intensity) {
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
