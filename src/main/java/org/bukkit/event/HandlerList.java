package org.bukkit.event;

import java.util.ArrayList;
import java.util.Collection;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.RegisteredListener;


public class HandlerList extends Object  {


	public static void bakeAll() {
	}

	public static void unregisterAll() {
	}

	public static void unregisterAll(Plugin plugin) {
	}

	public static void unregisterAll(Listener listener) {
	}

	public void register(RegisteredListener listener) {
	}

	public void registerAll(Collection<RegisteredListener> listeners) {
	}

	public void unregister(RegisteredListener listener) {
	}

	public void unregister(Plugin plugin) {
	}

	public void unregister(Listener listener) {
	}

	public void bake() {
	}

	public RegisteredListener[] getRegisteredListeners() {
		return null;
	}

	public static ArrayList<RegisteredListener> getRegisteredListeners(Plugin plugin) {
		return null;
	}

	public static ArrayList<HandlerList> getHandlerLists() {
		return null;
	}
}
