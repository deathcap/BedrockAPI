package org.bukkit.configuration.serialization;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import org.bukkit.configuration.serialization.ConfigurationSerializable;


public class ConfigurationSerialization extends Object  {


	protected Method getMethod(String name, boolean isStatic) {
		return null;
	}

	protected Constructor<? extends ConfigurationSerializable> getConstructor() {
		return null;
	}

	protected ConfigurationSerializable deserializeViaMethod(Method method, Map<String,?> args) {
		return null;
	}

	protected ConfigurationSerializable deserializeViaCtor(Constructor<? extends ConfigurationSerializable> ctor, Map<String,?> args) {
		return null;
	}

	public ConfigurationSerializable deserialize(Map<String,?> args) {
		return null;
	}

	public static ConfigurationSerializable deserializeObject(Map<String,?> args, Class<? extends ConfigurationSerializable> clazz) {
		return null;
	}

	public static ConfigurationSerializable deserializeObject(Map<String,?> args) {
		return null;
	}

	public static void registerClass(Class<? extends ConfigurationSerializable> clazz) {
	}

	public static void registerClass(Class<? extends ConfigurationSerializable> clazz, String alias) {
	}

	public static void unregisterClass(String alias) {
	}

	public static void unregisterClass(Class<? extends ConfigurationSerializable> clazz) {
	}

	public static Class<? extends ConfigurationSerializable> getClassByAlias(String alias) {
		return null;
	}

	public static String getAlias(Class<? extends ConfigurationSerializable> clazz) {
		return null;
	}
}
