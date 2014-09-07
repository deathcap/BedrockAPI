package org.bukkit.event.painting;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Painting;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.painting.PaintingBreakEvent;
import org.bukkit.event.painting.PaintingBreakEvent.RemoveCause;
import org.bukkit.event.painting.PaintingEvent;


@Deprecated public class PaintingBreakByEntityEvent extends PaintingBreakEvent  {


	public PaintingBreakByEntityEvent(Painting painting, Entity remover) {
        super(painting, RemoveCause.ENTITY);
	}

	public Entity getRemover() {
		return null;
	}
}
