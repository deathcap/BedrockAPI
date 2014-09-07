package org.bukkit.event.painting;

import java.io.Serializable;
import org.bukkit.event.painting.PaintingBreakEvent;
import org.bukkit.event.painting.PaintingBreakEvent.RemoveCause;
import org.bukkit.entity.Painting;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.painting.PaintingBreakByEntityEvent;
import org.bukkit.event.painting.PaintingBreakEvent.RemoveCause;
import org.bukkit.event.painting.PaintingEvent;


@Deprecated public class PaintingBreakEvent extends PaintingEvent implements Cancellable  {


	public PaintingBreakEvent(Painting painting, PaintingBreakEvent.RemoveCause cause) {
        super(painting);
	}

	public PaintingBreakEvent.RemoveCause getCause() {
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
		FIRE,
		OBSTRUCTION,
		WATER,
		PHYSICS,
		;
	}
}
