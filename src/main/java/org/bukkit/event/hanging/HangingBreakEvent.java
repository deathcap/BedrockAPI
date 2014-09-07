package org.bukkit.event.hanging;

import java.io.Serializable;
import org.bukkit.event.hanging.HangingBreakEvent;
import org.bukkit.event.hanging.HangingBreakEvent.RemoveCause;
import org.bukkit.entity.Hanging;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;
import org.bukkit.event.hanging.HangingBreakEvent.RemoveCause;
import org.bukkit.event.hanging.HangingEvent;


public class HangingBreakEvent extends HangingEvent implements Cancellable  {


	public HangingBreakEvent(Hanging hanging, HangingBreakEvent.RemoveCause cause) {
        super(hanging);
	}

	public HangingBreakEvent.RemoveCause getCause() {
		return null;
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

	
	
	
	public static enum RemoveCause  {
	
		ENTITY,
		EXPLOSION,
		OBSTRUCTION,
		PHYSICS,
		DEFAULT,
		;
	}
}
