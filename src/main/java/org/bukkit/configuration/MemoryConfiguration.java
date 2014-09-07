package org.bukkit.configuration;

import java.util.Map;
import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.MemoryConfigurationOptions;
import org.bukkit.configuration.MemorySection;
import org.bukkit.configuration.file.FileConfiguration;


public class MemoryConfiguration extends MemorySection implements Configuration  {


	public void addDefault(String path, Object value) {
	}

	public void addDefaults(Map<String,Object> defaults) {
	}

	public void addDefaults(Configuration defaults) {
	}

	public void setDefaults(Configuration defaults) {
	}

	public Configuration getDefaults() {
		return null;
	}

	public ConfigurationSection getParent() {
		return null;
	}

	public MemoryConfigurationOptions options() {
		return null;
	}
}
