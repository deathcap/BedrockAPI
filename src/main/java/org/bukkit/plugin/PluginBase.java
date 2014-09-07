package org.bukkit.plugin;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.TabCompleter;
import org.bukkit.command.TabExecutor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;


public abstract class PluginBase extends Object implements Plugin  {


	public PluginBase() {
	}

	public final int hashCode() {
		return 0;
	}

	public final boolean equals(Object obj) {
		return false;
	}

	public final String getName() {
		return null;
	}
}
