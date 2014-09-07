package org.bukkit.configuration.file;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.util.Map;
import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.MemoryConfiguration;
import org.bukkit.configuration.MemorySection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.configuration.file.YamlConfigurationOptions;


public class YamlConfiguration extends FileConfiguration  {


	public String saveToString() {
		return null;
	}

	public void loadFromString(String contents) throws InvalidConfigurationException {
	}

	protected void convertMapsToSections(Map<?,?> input, ConfigurationSection section) {
	}

	protected String parseHeader(String input) {
		return null;
	}

	protected String buildHeader() {
		return null;
	}

	public YamlConfigurationOptions options() {
		return null;
	}

	public static YamlConfiguration loadConfiguration(File file) {
		return null;
	}

	@Deprecated public static YamlConfiguration loadConfiguration(InputStream stream) {
		return null;
	}

	public static YamlConfiguration loadConfiguration(Reader reader) {
		return null;
	}
}
