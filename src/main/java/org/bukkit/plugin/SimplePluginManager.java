package org.bukkit.plugin;

import java.io.File;
import java.util.Set;
import org.bukkit.Server;
import org.bukkit.command.SimpleCommandMap;
import org.bukkit.event.Event;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.permissions.Permissible;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.EventExecutor;
import org.bukkit.plugin.InvalidPluginException;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginLoader;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.UnknownDependencyException;


public final class SimplePluginManager extends Object implements PluginManager  {


	public SimplePluginManager(Server instance, SimpleCommandMap commandMap) {
	}

	public void registerInterface(Class<? extends PluginLoader> loader) throws IllegalArgumentException {
	}

	public Plugin[] loadPlugins(File directory) {
		return null;
	}

	public Plugin loadPlugin(File file) throws InvalidPluginException, UnknownDependencyException {
		return null;
	}

	public Plugin getPlugin(String name) {
		return null;
	}

	public Plugin[] getPlugins() {
		return null;
	}

	public boolean isPluginEnabled(String name) {
		return false;
	}

	public boolean isPluginEnabled(Plugin plugin) {
		return false;
	}

	public void enablePlugin(Plugin plugin) {
	}

	public void disablePlugins() {
	}

	public void disablePlugin(Plugin plugin) {
	}

	public void clearPlugins() {
	}

	public void callEvent(Event event) {
	}

	public void registerEvents(Listener listener, Plugin plugin) {
	}

	public void registerEvent(Class<? extends Event> event, Listener listener, EventPriority priority, EventExecutor executor, Plugin plugin) {
	}

	public void registerEvent(Class<? extends Event> event, Listener listener, EventPriority priority, EventExecutor executor, Plugin plugin, boolean ignoreCancelled) {
	}

	public Permission getPermission(String name) {
		return null;
	}

	public void addPermission(Permission perm) {
	}

	public Set<Permission> getDefaultPermissions(boolean op) {
		return null;
	}

	public void removePermission(Permission perm) {
	}

	public void removePermission(String name) {
	}

	public void recalculatePermissionDefaults(Permission perm) {
	}

	public void subscribeToPermission(String permission, Permissible permissible) {
	}

	public void unsubscribeFromPermission(String permission, Permissible permissible) {
	}

	public Set<Permissible> getPermissionSubscriptions(String permission) {
		return null;
	}

	public void subscribeToDefaultPerms(boolean op, Permissible permissible) {
	}

	public void unsubscribeFromDefaultPerms(boolean op, Permissible permissible) {
	}

	public Set<Permissible> getDefaultPermSubscriptions(boolean op) {
		return null;
	}

	public Set<Permission> getPermissions() {
		return null;
	}

	public boolean useTimings() {
		return false;
	}

	public void useTimings(boolean use) {
	}
}
