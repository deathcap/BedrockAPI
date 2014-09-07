package org.bukkit.configuration.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.MemoryConfiguration;
import org.bukkit.configuration.MemorySection;
import org.bukkit.configuration.file.FileConfigurationOptions;
import org.bukkit.configuration.file.YamlConfiguration;


public abstract class FileConfiguration extends MemoryConfiguration  {


	@Deprecated public static final boolean UTF8_OVERRIDE = false;

	@Deprecated public static final boolean UTF_BIG = false;

	@Deprecated public static final boolean SYSTEM_UTF = false;

	public FileConfiguration() {
	}

	public FileConfiguration(Configuration defaults) {
	}

	public void save(File file) throws IOException {
	}

	public void save(String file) throws IOException {
	}

	public abstract String saveToString();

	public void load(File file) throws FileNotFoundException, IOException, InvalidConfigurationException {
	}

	@Deprecated public void load(InputStream stream) throws IOException, InvalidConfigurationException {
	}

	public void load(Reader reader) throws IOException, InvalidConfigurationException {
	}

	public void load(String file) throws FileNotFoundException, IOException, InvalidConfigurationException {
	}

	public abstract void loadFromString(String contents) throws InvalidConfigurationException;

	protected abstract String buildHeader();

	public FileConfigurationOptions options() {
		return null;
	}
}
