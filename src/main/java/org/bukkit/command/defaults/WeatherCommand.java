package org.bukkit.command.defaults;

import java.util.List;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.VanillaCommand;


public class WeatherCommand extends VanillaCommand  {


	public WeatherCommand() {
        super("Weather");
	}

	public boolean execute(CommandSender sender, String currentAlias, String[] args) {
		return false;
	}

	public List<String> tabComplete(CommandSender sender, String alias, String[] args) {
		return null;
	}
}
