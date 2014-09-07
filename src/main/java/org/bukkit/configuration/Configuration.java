package org.bukkit.configuration;

import java.util.Map;
import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.ConfigurationOptions;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.MemoryConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;


public interface Configuration extends ConfigurationSection  {


	void addDefault(String path, Object value);

	void addDefaults(Map<String,Object> defaults);

	void addDefaults(Configuration defaults);

	void setDefaults(Configuration defaults);

	Configuration getDefaults();

	ConfigurationOptions options();
}
