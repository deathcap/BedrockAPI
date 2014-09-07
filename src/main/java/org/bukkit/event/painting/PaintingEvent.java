package org.bukkit.event.painting;

import org.bukkit.entity.Painting;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.painting.PaintingBreakEvent;
import org.bukkit.event.painting.PaintingPlaceEvent;


@Deprecated public abstract class PaintingEvent extends Event  {


	public Painting getPainting() {
		return null;
	}
}
