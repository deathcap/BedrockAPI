package org.bukkit.plugin;

import java.io.File;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.bukkit.event.Event;
import org.bukkit.event.Listener;
import org.bukkit.plugin.InvalidDescriptionException;
import org.bukkit.plugin.InvalidPluginException;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.RegisteredListener;
import org.bukkit.plugin.UnknownDependencyException;
import org.bukkit.plugin.java.JavaPluginLoader;


public interface PluginLoader  {


	Plugin loadPlugin(File file) throws InvalidPluginException, UnknownDependencyException;

	PluginDescriptionFile getPluginDescription(File file) throws InvalidDescriptionException;

	Pattern[] getPluginFileFilters();

	Map<Class<? extends Event>,Set<RegisteredListener>> createRegisteredListeners(Listener listener, Plugin plugin);

	void enablePlugin(Plugin plugin);

	void disablePlugin(Plugin plugin);
}
