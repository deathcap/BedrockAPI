package org.bukkit.event.world;

import java.io.Serializable;
import org.bukkit.event.world.PortalCreateEvent;
import org.bukkit.event.world.PortalCreateEvent.CreateReason;
import java.util.ArrayList;
import java.util.Collection;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.world.PortalCreateEvent.CreateReason;
import org.bukkit.event.world.WorldEvent;


public class PortalCreateEvent extends WorldEvent implements Cancellable  {


	public PortalCreateEvent(Collection<Block> blocks, World world, PortalCreateEvent.CreateReason reason) {
        super(world);
	}

	public ArrayList<Block> getBlocks() {
		return null;
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}

	public PortalCreateEvent.CreateReason getReason() {
		return null;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}

	
	
	
	public static enum CreateReason  {
	
		FIRE,
		OBC_DESTINATION,
		;
	}
}
