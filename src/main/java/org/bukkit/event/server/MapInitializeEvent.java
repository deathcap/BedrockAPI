package org.bukkit.event.server;

import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.server.ServerEvent;
import org.bukkit.map.MapView;


public class MapInitializeEvent extends ServerEvent  {


	public MapInitializeEvent(MapView mapView) {
	}

	public MapView getMap() {
		return null;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
