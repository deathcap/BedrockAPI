package org.bukkit.event.entity;

import java.util.List;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;


public class EntityExplodeEvent extends EntityEvent implements Cancellable  {


	public EntityExplodeEvent(Entity what, Location location, List<Block> blocks, float yield) {
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}

	public List<Block> blockList() {
		return null;
	}

	public Location getLocation() {
		return null;
	}

	public float getYield() {
		return 0.0f;
	}

	public void setYield(float yield) {
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
