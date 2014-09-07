package org.bukkit.plugin;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.ServicePriority;


public class RegisteredServiceProvider<T> extends Object implements Comparable<RegisteredServiceProvider<?>>  {


	public RegisteredServiceProvider(Class<T> service, T provider, ServicePriority priority, Plugin plugin) {
	}

	public Class<T> getService() {
		return null;
	}

	public Plugin getPlugin() {
		return null;
	}

	public T getProvider() {
		return null;
	}

	public ServicePriority getPriority() {
		return null;
	}

	public int compareTo(RegisteredServiceProvider<?> other) {
		return 0;
	}
}
