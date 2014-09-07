package org.bukkit.event.entity;

import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.entity.EntityCombustEvent;
import org.bukkit.event.entity.EntityEvent;


public class EntityCombustByBlockEvent extends EntityCombustEvent  {


	public Block getCombuster() {
		return null;
	}
}
