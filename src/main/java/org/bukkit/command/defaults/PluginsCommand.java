package org.bukkit.command.defaults;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;


public class PluginsCommand extends BukkitCommand  {


	public PluginsCommand(String name) {
        super("Plugins");
	}

	public boolean execute(CommandSender sender, String currentAlias, String[] args) {
		return false;
	}
}
