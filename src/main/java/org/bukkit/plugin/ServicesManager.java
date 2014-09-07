package org.bukkit.plugin;

import java.util.Collection;
import java.util.List;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.ServicePriority;
import org.bukkit.plugin.SimpleServicesManager;


public interface ServicesManager  {


	<T> void register(Class<T> service, T provider, Plugin plugin, ServicePriority priority);

	void unregisterAll(Plugin plugin);

	void unregister(Class<?> service, Object provider);

	void unregister(Object provider);

	<T> T load(Class<T> service);

	<T> RegisteredServiceProvider<T> getRegistration(Class<T> service);

	List<RegisteredServiceProvider<?>> getRegistrations(Plugin plugin);

	<T> Collection<RegisteredServiceProvider<T>> getRegistrations(Class<T> service);

	Collection<Class<?>> getKnownServices();

	<T> boolean isProvidedFor(Class<T> service);
}
