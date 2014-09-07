package org.bukkit.plugin;

import org.bukkit.event.Event;
import org.bukkit.event.EventException;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.plugin.EventExecutor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.TimedRegisteredListener;


public class RegisteredListener extends Object  {


	public Listener getListener() {
		return null;
	}

	public Plugin getPlugin() {
		return null;
	}

	public EventPriority getPriority() {
		return null;
	}

	public void callEvent(Event event) throws EventException {
	}

	public boolean isIgnoringCancelled() {
		return false;
	}
}
