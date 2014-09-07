package org.bukkit.configuration;

import org.bukkit.configuration.ConfigurationOptions;
import org.bukkit.configuration.MemoryConfiguration;
import org.bukkit.configuration.MemoryConfigurationOptions;
import org.bukkit.configuration.file.FileConfigurationOptions;


public class MemoryConfigurationOptions extends ConfigurationOptions  {


	protected MemoryConfigurationOptions(MemoryConfiguration configuration) {
        super(configuration);
	}

	public MemoryConfiguration configuration() {
		return null;
	}

	public MemoryConfigurationOptions copyDefaults(boolean value) {
		return null;
	}

	public MemoryConfigurationOptions pathSeparator(char value) {
		return null;
	}
}
