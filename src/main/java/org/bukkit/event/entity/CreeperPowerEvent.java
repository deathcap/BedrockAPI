package org.bukkit.event.entity;

import java.io.Serializable;
import org.bukkit.event.entity.CreeperPowerEvent;
import org.bukkit.event.entity.CreeperPowerEvent.PowerCause;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.LightningStrike;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.CreeperPowerEvent.PowerCause;
import org.bukkit.event.entity.EntityEvent;


public class CreeperPowerEvent extends EntityEvent implements Cancellable  {


	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}

	public Creeper getEntity() {
		return null;
	}

	public LightningStrike getLightning() {
		return null;
	}

	public CreeperPowerEvent.PowerCause getCause() {
		return null;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}

	
	
	
	public static enum PowerCause  {
	
		LIGHTNING,
		SET_ON,
		SET_OFF,
		;
	
	
	}
}
