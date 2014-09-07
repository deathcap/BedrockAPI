package org.bukkit.event.entity;

import java.io.Serializable;
import org.bukkit.event.entity.EntityUnleashEvent;
import org.bukkit.event.entity.EntityUnleashEvent.UnleashReason;
import org.bukkit.entity.Entity;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.event.entity.EntityUnleashEvent.UnleashReason;
import org.bukkit.event.player.PlayerUnleashEntityEvent;


public class EntityUnleashEvent extends EntityEvent  {


	public EntityUnleashEvent(Entity entity, EntityUnleashEvent.UnleashReason reason) {
	}

	public EntityUnleashEvent.UnleashReason getReason() {
		return null;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}

	
	
	
	public static enum UnleashReason  {
	
		HOLDER_GONE,
		PLAYER_UNLEASH,
		DISTANCE,
		UNKNOWN,
		;
	}
}
