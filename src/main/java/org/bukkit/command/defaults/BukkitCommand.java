package org.bukkit.command.defaults;

import java.util.List;
import org.bukkit.command.Command;
import org.bukkit.command.defaults.PluginsCommand;
import org.bukkit.command.defaults.ReloadCommand;
import org.bukkit.command.defaults.TimingsCommand;
import org.bukkit.command.defaults.VersionCommand;


public abstract class BukkitCommand extends Command  {


	protected BukkitCommand(String name) {
	}

	protected BukkitCommand(String name, String description, String usageMessage, List<String> aliases) {
	}
}
