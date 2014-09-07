package org.bukkit.event.server;

import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.server.ServerEvent;
import org.bukkit.event.server.ServiceEvent;
import org.bukkit.plugin.RegisteredServiceProvider;


public class ServiceRegisterEvent extends ServiceEvent  {


	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
