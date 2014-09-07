package org.bukkit.event.entity;

import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.entity.EntityCombustEvent;
import org.bukkit.event.entity.EntityEvent;


public class EntityCombustByEntityEvent extends EntityCombustEvent  {


	public Entity getCombuster() {
		return null;
	}
}
