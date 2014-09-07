package org.bukkit.plugin;

import java.io.File;
import java.io.InputStream;
import java.util.logging.Logger;
import org.bukkit.Server;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.TabCompleter;
import org.bukkit.command.TabExecutor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.PluginBase;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginLoader;
import org.bukkit.plugin.java.JavaPlugin;


public interface Plugin extends TabExecutor  {


	File getDataFolder();

	PluginDescriptionFile getDescription();

	FileConfiguration getConfig();

	InputStream getResource(String filename);

	void saveConfig();

	void saveDefaultConfig();

	void saveResource(String resourcePath, boolean replace);

	void reloadConfig();

	PluginLoader getPluginLoader();

	Server getServer();

	boolean isEnabled();

	void onDisable();

	void onLoad();

	void onEnable();

	boolean isNaggable();

	void setNaggable(boolean canNag);

	com.avaje.ebean.EbeanServer getDatabase();

	ChunkGenerator getDefaultWorldGenerator(String worldName, String id);

	Logger getLogger();

	String getName();
}
