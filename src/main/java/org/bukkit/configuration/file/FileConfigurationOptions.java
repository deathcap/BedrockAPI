package org.bukkit.configuration.file;

import org.bukkit.configuration.ConfigurationOptions;
import org.bukkit.configuration.MemoryConfiguration;
import org.bukkit.configuration.MemoryConfigurationOptions;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.FileConfigurationOptions;
import org.bukkit.configuration.file.YamlConfigurationOptions;


public class FileConfigurationOptions extends MemoryConfigurationOptions  {


	protected FileConfigurationOptions(MemoryConfiguration configuration) {
        super(configuration);
	}

	public FileConfiguration configuration() {
		return null;
	}

	public FileConfigurationOptions copyDefaults(boolean value) {
		return null;
	}

	public FileConfigurationOptions pathSeparator(char value) {
		return null;
	}

	public String header() {
		return null;
	}

	public FileConfigurationOptions header(String value) {
		return null;
	}

	public boolean copyHeader() {
		return false;
	}

	public FileConfigurationOptions copyHeader(boolean value) {
		return null;
	}
}
