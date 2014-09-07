package org.bukkit.event.weather;

import org.bukkit.World;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.weather.LightningStrikeEvent;
import org.bukkit.event.weather.ThunderChangeEvent;
import org.bukkit.event.weather.WeatherChangeEvent;


public abstract class WeatherEvent extends Event  {


	public final World getWorld() {
		return null;
	}
}
