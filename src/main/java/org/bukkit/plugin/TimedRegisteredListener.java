package org.bukkit.plugin;

import org.bukkit.event.Event;
import org.bukkit.event.EventException;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.plugin.EventExecutor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.RegisteredListener;


public class TimedRegisteredListener extends RegisteredListener  {


	public TimedRegisteredListener(Listener pluginListener, EventExecutor eventExecutor, EventPriority eventPriority, Plugin registeredPlugin, boolean listenCancelled) {
        super(pluginListener, eventExecutor, eventPriority, registeredPlugin, listenCancelled);
	}

	public void callEvent(Event event) throws EventException {
	}

	public void reset() {
	}

	public int getCount() {
		return 0;
	}

	public long getTotalTime() {
		return 0;
	}

	public Class<? extends Event> getEventClass() {
		return null;
	}

	public boolean hasMultiple() {
		return false;
	}
}
