package org.bukkit.plugin;

import java.io.File;
import java.util.Set;
import org.bukkit.event.Event;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.permissions.Permissible;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.EventExecutor;
import org.bukkit.plugin.InvalidDescriptionException;
import org.bukkit.plugin.InvalidPluginException;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginLoader;
import org.bukkit.plugin.SimplePluginManager;
import org.bukkit.plugin.UnknownDependencyException;


public interface PluginManager  {


	void registerInterface(Class<? extends PluginLoader> loader) throws IllegalArgumentException;

	Plugin getPlugin(String name);

	Plugin[] getPlugins();

	boolean isPluginEnabled(String name);

	boolean isPluginEnabled(Plugin plugin);

	Plugin loadPlugin(File file) throws InvalidPluginException, InvalidDescriptionException, UnknownDependencyException;

	Plugin[] loadPlugins(File directory);

	void disablePlugins();

	void clearPlugins();

	void callEvent(Event event) throws IllegalStateException;

	void registerEvents(Listener listener, Plugin plugin);

	void registerEvent(Class<? extends Event> event, Listener listener, EventPriority priority, EventExecutor executor, Plugin plugin);

	void registerEvent(Class<? extends Event> event, Listener listener, EventPriority priority, EventExecutor executor, Plugin plugin, boolean ignoreCancelled);

	void enablePlugin(Plugin plugin);

	void disablePlugin(Plugin plugin);

	Permission getPermission(String name);

	void addPermission(Permission perm);

	void removePermission(Permission perm);

	void removePermission(String name);

	Set<Permission> getDefaultPermissions(boolean op);

	void recalculatePermissionDefaults(Permission perm);

	void subscribeToPermission(String permission, Permissible permissible);

	void unsubscribeFromPermission(String permission, Permissible permissible);

	Set<Permissible> getPermissionSubscriptions(String permission);

	void subscribeToDefaultPerms(boolean op, Permissible permissible);

	void unsubscribeFromDefaultPerms(boolean op, Permissible permissible);

	Set<Permissible> getDefaultPermSubscriptions(boolean op);

	Set<Permission> getPermissions();

	boolean useTimings();
}
