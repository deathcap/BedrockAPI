package org.bukkit.event.server;

import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.server.PluginDisableEvent;
import org.bukkit.event.server.PluginEnableEvent;
import org.bukkit.event.server.ServerEvent;
import org.bukkit.plugin.Plugin;


public abstract class PluginEvent extends ServerEvent  {


	public Plugin getPlugin() {
		return null;
	}
}
