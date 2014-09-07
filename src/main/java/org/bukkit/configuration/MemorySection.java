package org.bukkit.configuration;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bukkit.Color;
import org.bukkit.OfflinePlayer;
import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.MemoryConfiguration;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;


public class MemorySection extends Object implements ConfigurationSection  {


	public Set<String> getKeys(boolean deep) {
		return null;
	}

	public Map<String,Object> getValues(boolean deep) {
		return null;
	}

	public boolean contains(String path) {
		return false;
	}

	public boolean isSet(String path) {
		return false;
	}

	public String getCurrentPath() {
		return null;
	}

	public String getName() {
		return null;
	}

	public Configuration getRoot() {
		return null;
	}

	public ConfigurationSection getParent() {
		return null;
	}

	public void addDefault(String path, Object value) {
	}

	public ConfigurationSection getDefaultSection() {
		return null;
	}

	public void set(String path, Object value) {
	}

	public Object get(String path) {
		return null;
	}

	public Object get(String path, Object def) {
		return null;
	}

	public ConfigurationSection createSection(String path) {
		return null;
	}

	public ConfigurationSection createSection(String path, Map<?,?> map) {
		return null;
	}

	public String getString(String path) {
		return null;
	}

	public String getString(String path, String def) {
		return null;
	}

	public boolean isString(String path) {
		return false;
	}

	public int getInt(String path) {
		return 0;
	}

	public int getInt(String path, int def) {
		return 0;
	}

	public boolean isInt(String path) {
		return false;
	}

	public boolean getBoolean(String path) {
		return false;
	}

	public boolean getBoolean(String path, boolean def) {
		return false;
	}

	public boolean isBoolean(String path) {
		return false;
	}

	public double getDouble(String path) {
		return 0.0;
	}

	public double getDouble(String path, double def) {
		return 0.0;
	}

	public boolean isDouble(String path) {
		return false;
	}

	public long getLong(String path) {
		return 0;
	}

	public long getLong(String path, long def) {
		return 0;
	}

	public boolean isLong(String path) {
		return false;
	}

	public List<?> getList(String path) {
		return null;
	}

	public List<?> getList(String path, List<?> def) {
		return null;
	}

	public boolean isList(String path) {
		return false;
	}

	public List<String> getStringList(String path) {
		return null;
	}

	public List<Integer> getIntegerList(String path) {
		return null;
	}

	public List<Boolean> getBooleanList(String path) {
		return null;
	}

	public List<Double> getDoubleList(String path) {
		return null;
	}

	public List<Float> getFloatList(String path) {
		return null;
	}

	public List<Long> getLongList(String path) {
		return null;
	}

	public List<Byte> getByteList(String path) {
		return null;
	}

	public List<Character> getCharacterList(String path) {
		return null;
	}

	public List<Short> getShortList(String path) {
		return null;
	}

	public List<Map<?,?>> getMapList(String path) {
		return null;
	}

	public Vector getVector(String path) {
		return null;
	}

	public Vector getVector(String path, Vector def) {
		return null;
	}

	public boolean isVector(String path) {
		return false;
	}

	public OfflinePlayer getOfflinePlayer(String path) {
		return null;
	}

	public OfflinePlayer getOfflinePlayer(String path, OfflinePlayer def) {
		return null;
	}

	public boolean isOfflinePlayer(String path) {
		return false;
	}

	public ItemStack getItemStack(String path) {
		return null;
	}

	public ItemStack getItemStack(String path, ItemStack def) {
		return null;
	}

	public boolean isItemStack(String path) {
		return false;
	}

	public Color getColor(String path) {
		return null;
	}

	public Color getColor(String path, Color def) {
		return null;
	}

	public boolean isColor(String path) {
		return false;
	}

	public ConfigurationSection getConfigurationSection(String path) {
		return null;
	}

	public boolean isConfigurationSection(String path) {
		return false;
	}

	protected boolean isPrimitiveWrapper(Object input) {
		return false;
	}

	protected Object getDefault(String path) {
		return null;
	}

	protected void mapChildrenKeys(Set<String> output, ConfigurationSection section, boolean deep) {
	}

	protected void mapChildrenValues(Map<String,Object> output, ConfigurationSection section, boolean deep) {
	}

	public static String createPath(ConfigurationSection section, String key) {
		return null;
	}

	public static String createPath(ConfigurationSection section, String key, ConfigurationSection relativeTo) {
		return null;
	}

	public String toString() {
		return null;
	}
}
