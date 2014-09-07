package org.bukkit.event.server;

import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.server.ServerEvent;
import org.bukkit.event.server.ServiceRegisterEvent;
import org.bukkit.event.server.ServiceUnregisterEvent;
import org.bukkit.plugin.RegisteredServiceProvider;


public abstract class ServiceEvent extends ServerEvent  {


	public RegisteredServiceProvider<?> getProvider() {
		return null;
	}
}
