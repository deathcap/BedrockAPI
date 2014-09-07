package org.bukkit.event;

import java.io.Serializable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.BlockEvent;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.event.entity.PlayerLeashEntityEvent;
import org.bukkit.event.hanging.HangingEvent;
import org.bukkit.event.inventory.InventoryEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.inventory.InventoryPickupItemEvent;
import org.bukkit.event.painting.PaintingEvent;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerPreLoginEvent;
import org.bukkit.event.server.ServerEvent;
import org.bukkit.event.vehicle.VehicleEvent;
import org.bukkit.event.weather.WeatherEvent;
import org.bukkit.event.world.WorldEvent;


public abstract class Event extends Object  {


	public String getEventName() {
		return null;
	}

	public abstract HandlerList getHandlers();

	public final boolean isAsynchronous() {
		return false;
	}

	
	
	
	public static enum Result  {
	
		DENY,
		DEFAULT,
		ALLOW,
		;
	
	
	}
}
