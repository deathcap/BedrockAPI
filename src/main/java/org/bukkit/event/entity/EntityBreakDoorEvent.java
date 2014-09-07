package org.bukkit.event.entity;

import org.bukkit.block.Block;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.event.entity.EntityEvent;


public class EntityBreakDoorEvent extends EntityChangeBlockEvent  {


	public LivingEntity getEntity() {
		return null;
	}
}
