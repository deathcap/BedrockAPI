package org.bukkit.plugin.java;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;
import java.util.logging.Logger;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.command.TabCompleter;
import org.bukkit.command.TabExecutor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginBase;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginLoader;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.JavaPluginLoader;


public abstract class JavaPlugin extends PluginBase  {


	public JavaPlugin() {
	}

	@Deprecated protected JavaPlugin(PluginLoader loader, Server server, PluginDescriptionFile description, File dataFolder, File file) {
	}

	protected JavaPlugin(JavaPluginLoader loader, PluginDescriptionFile description, File dataFolder, File file) {
	}

	public final File getDataFolder() {
		return null;
	}

	public final PluginLoader getPluginLoader() {
		return null;
	}

	public final Server getServer() {
		return null;
	}

	public final boolean isEnabled() {
		return false;
	}

	protected File getFile() {
		return null;
	}

	public final PluginDescriptionFile getDescription() {
		return null;
	}

	public FileConfiguration getConfig() {
		return null;
	}

	protected final Reader getTextResource(String file) {
		return null;
	}

	public void reloadConfig() {
	}

	public void saveConfig() {
	}

	public void saveDefaultConfig() {
	}

	public void saveResource(String resourcePath, boolean replace) {
	}

	public InputStream getResource(String filename) {
		return null;
	}

	protected final ClassLoader getClassLoader() {
		return null;
	}

	protected final void setEnabled(boolean enabled) {
	}

	@Deprecated protected final void initialize(PluginLoader loader, Server server, PluginDescriptionFile description, File dataFolder, File file, ClassLoader classLoader) {
	}

	public List<Class<?>> getDatabaseClasses() {
		return null;
	}

	@Deprecated public final boolean isInitialized() {
		return false;
	}

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		return false;
	}

	public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
		return null;
	}

	public PluginCommand getCommand(String name) {
		return null;
	}

	public void onLoad() {
	}

	public void onDisable() {
	}

	public void onEnable() {
	}

	public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
		return null;
	}

	public final boolean isNaggable() {
		return false;
	}

	public final void setNaggable(boolean canNag) {
	}

	public com.avaje.ebean.EbeanServer getDatabase() {
		return null;
	}

	protected void installDDL() {
	}

	protected void removeDDL() {
	}

	public final Logger getLogger() {
		return null;
	}

	public String toString() {
		return null;
	}

	public static <T extends JavaPlugin> T getPlugin(Class<T> clazz) {
		return null;
	}

	public static JavaPlugin getProvidingPlugin(Class<?> clazz) {
		return null;
	}
}
