package org.bukkit.event.entity;

import java.io.Serializable;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.event.entity.EntityTargetEvent.TargetReason;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.event.entity.EntityTargetEvent.TargetReason;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;


public class EntityTargetEvent extends EntityEvent implements Cancellable  {


	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}

	public EntityTargetEvent.TargetReason getReason() {
		return null;
	}

	public Entity getTarget() {
		return null;
	}

	public void setTarget(Entity target) {
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}

	
	
	
	public static enum TargetReason  {
	
		TARGET_DIED,
		CLOSEST_PLAYER,
		TARGET_ATTACKED_ENTITY,
		PIG_ZOMBIE_TARGET,
		FORGOT_TARGET,
		TARGET_ATTACKED_OWNER,
		OWNER_ATTACKED_TARGET,
		RANDOM_TARGET,
		DEFEND_VILLAGE,
		TARGET_ATTACKED_NEARBY_ENTITY,
		REINFORCEMENT_TARGET,
		COLLISION,
		CUSTOM,
		;
	
	
	}
}
