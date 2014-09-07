package org.bukkit.event.weather;

import org.bukkit.World;
import org.bukkit.entity.LightningStrike;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.weather.WeatherEvent;


public class LightningStrikeEvent extends WeatherEvent implements Cancellable  {


	public LightningStrikeEvent(World world, LightningStrike bolt) {
        super(world);
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}

	public LightningStrike getLightning() {
		return null;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
