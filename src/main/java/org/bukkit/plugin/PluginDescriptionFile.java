package org.bukkit.plugin;

import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionDefault;
import org.bukkit.plugin.InvalidDescriptionException;
import org.bukkit.plugin.PluginAwareness;
import org.bukkit.plugin.PluginLoadOrder;


public final class PluginDescriptionFile extends Object  {


	public PluginDescriptionFile(InputStream stream) throws InvalidDescriptionException {
	}

	public PluginDescriptionFile(Reader reader) throws InvalidDescriptionException {
	}

	public PluginDescriptionFile(String pluginName, String pluginVersion, String mainClass) {
	}

	public String getName() {
		return null;
	}

	public String getVersion() {
		return null;
	}

	public String getMain() {
		return null;
	}

	public String getDescription() {
		return null;
	}

	public PluginLoadOrder getLoad() {
		return null;
	}

	public List<String> getAuthors() {
		return null;
	}

	public String getWebsite() {
		return null;
	}

	public boolean isDatabaseEnabled() {
		return false;
	}

	public List<String> getDepend() {
		return null;
	}

	public List<String> getSoftDepend() {
		return null;
	}

	public List<String> getLoadBefore() {
		return null;
	}

	public String getPrefix() {
		return null;
	}

	public Map<String,Map<String,Object>> getCommands() {
		return null;
	}

	public List<Permission> getPermissions() {
		return null;
	}

	public PermissionDefault getPermissionDefault() {
		return null;
	}

	public Set<PluginAwareness> getAwareness() {
		return null;
	}

	public String getFullName() {
		return null;
	}

	@Deprecated public String getClassLoaderOf() {
		return null;
	}

	public void setDatabaseEnabled(boolean database) {
	}

	public void save(Writer writer) {
	}

	@Deprecated public String getRawName() {
		return null;
	}
}
