package org.bukkit.event.entity;

import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.event.entity.EntityTargetEvent.TargetReason;


public class EntityTargetLivingEntityEvent extends EntityTargetEvent  {


	public EntityTargetLivingEntityEvent(Entity entity, LivingEntity target, EntityTargetEvent.TargetReason reason) {
        super(entity, target, reason);
	}

	public LivingEntity getTarget() {
		return null;
	}

	public void setTarget(Entity target) {
	}
}
