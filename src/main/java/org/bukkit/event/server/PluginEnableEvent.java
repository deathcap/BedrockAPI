package org.bukkit.event.server;

import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.server.PluginEvent;
import org.bukkit.event.server.ServerEvent;
import org.bukkit.plugin.Plugin;


public class PluginEnableEvent extends PluginEvent  {


	public PluginEnableEvent(Plugin plugin) {
        super(plugin);
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
