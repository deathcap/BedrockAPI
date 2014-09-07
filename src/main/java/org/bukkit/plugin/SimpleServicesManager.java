package org.bukkit.plugin;

import java.util.List;
import java.util.Set;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.ServicePriority;
import org.bukkit.plugin.ServicesManager;


public class SimpleServicesManager extends Object implements ServicesManager  {


	public SimpleServicesManager() {
	}

	public <T> void register(Class<T> service, T provider, Plugin plugin, ServicePriority priority) {
	}

	public void unregisterAll(Plugin plugin) {
	}

	public void unregister(Class<?> service, Object provider) {
	}

	public void unregister(Object provider) {
	}

	public <T> T load(Class<T> service) {
		return null;
	}

	public <T> RegisteredServiceProvider<T> getRegistration(Class<T> service) {
		return null;
	}

	public List<RegisteredServiceProvider<?>> getRegistrations(Plugin plugin) {
		return null;
	}

	public <T> List<RegisteredServiceProvider<T>> getRegistrations(Class<T> service) {
		return null;
	}

	public Set<Class<?>> getKnownServices() {
		return null;
	}

	public <T> boolean isProvidedFor(Class<T> service) {
		return false;
	}
}
