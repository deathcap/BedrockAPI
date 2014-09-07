package org.bukkit.event.hanging;

import org.bukkit.entity.Hanging;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.hanging.HangingBreakEvent;
import org.bukkit.event.hanging.HangingPlaceEvent;


public abstract class HangingEvent extends Event  {


	protected Hanging hanging = null;

	protected HangingEvent(Hanging painting) {
	}

	public Hanging getEntity() {
		return null;
	}
}
