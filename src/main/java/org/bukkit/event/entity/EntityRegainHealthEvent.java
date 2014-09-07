package org.bukkit.event.entity;

import java.io.Serializable;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.event.entity.EntityRegainHealthEvent.RegainReason;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.event.entity.EntityRegainHealthEvent.RegainReason;


public class EntityRegainHealthEvent extends EntityEvent implements Cancellable  {


	public double getAmount() {
		return 0.0;
	}

	@Deprecated public int _INVALID_getAmount() {
		return 0;
	}

	public void setAmount(double amount) {
	}

	@Deprecated public void _INVALID_setAmount(int amount) {
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}

	public EntityRegainHealthEvent.RegainReason getRegainReason() {
		return null;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}

	
	
	
	public static enum RegainReason  {
	
		REGEN,
		SATIATED,
		EATING,
		ENDER_CRYSTAL,
		MAGIC,
		MAGIC_REGEN,
		WITHER_SPAWN,
		WITHER,
		CUSTOM,
		;
	
	
	}
}
