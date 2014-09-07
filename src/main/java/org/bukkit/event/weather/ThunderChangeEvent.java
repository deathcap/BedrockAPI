package org.bukkit.event.weather;

import org.bukkit.World;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.weather.WeatherEvent;


public class ThunderChangeEvent extends WeatherEvent implements Cancellable  {


	public ThunderChangeEvent(World world, boolean to) {
        super(world);
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}

	public boolean toThunderState() {
		return false;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
