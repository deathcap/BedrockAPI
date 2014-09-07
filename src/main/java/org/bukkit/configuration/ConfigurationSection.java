package org.bukkit.configuration;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bukkit.Color;
import org.bukkit.OfflinePlayer;
import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.MemoryConfiguration;
import org.bukkit.configuration.MemorySection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;


public interface ConfigurationSection  {


	Set<String> getKeys(boolean deep);

	Map<String,Object> getValues(boolean deep);

	boolean contains(String path);

	boolean isSet(String path);

	String getCurrentPath();

	String getName();

	Configuration getRoot();

	ConfigurationSection getParent();

	Object get(String path);

	Object get(String path, Object def);

	void set(String path, Object value);

	ConfigurationSection createSection(String path);

	ConfigurationSection createSection(String path, Map<?,?> map);

	String getString(String path);

	String getString(String path, String def);

	boolean isString(String path);

	int getInt(String path);

	int getInt(String path, int def);

	boolean isInt(String path);

	boolean getBoolean(String path);

	boolean getBoolean(String path, boolean def);

	boolean isBoolean(String path);

	double getDouble(String path);

	double getDouble(String path, double def);

	boolean isDouble(String path);

	long getLong(String path);

	long getLong(String path, long def);

	boolean isLong(String path);

	List<?> getList(String path);

	List<?> getList(String path, List<?> def);

	boolean isList(String path);

	List<String> getStringList(String path);

	List<Integer> getIntegerList(String path);

	List<Boolean> getBooleanList(String path);

	List<Double> getDoubleList(String path);

	List<Float> getFloatList(String path);

	List<Long> getLongList(String path);

	List<Byte> getByteList(String path);

	List<Character> getCharacterList(String path);

	List<Short> getShortList(String path);

	List<Map<?,?>> getMapList(String path);

	Vector getVector(String path);

	Vector getVector(String path, Vector def);

	boolean isVector(String path);

	OfflinePlayer getOfflinePlayer(String path);

	OfflinePlayer getOfflinePlayer(String path, OfflinePlayer def);

	boolean isOfflinePlayer(String path);

	ItemStack getItemStack(String path);

	ItemStack getItemStack(String path, ItemStack def);

	boolean isItemStack(String path);

	Color getColor(String path);

	Color getColor(String path, Color def);

	boolean isColor(String path);

	ConfigurationSection getConfigurationSection(String path);

	boolean isConfigurationSection(String path);

	ConfigurationSection getDefaultSection();

	void addDefault(String path, Object value);
}
