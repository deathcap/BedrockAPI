package org.bukkit.command.defaults;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.VanillaCommand;


public class TellCommand extends VanillaCommand  {


	public TellCommand() {
        super("Tell");
	}

	public boolean execute(CommandSender sender, String currentAlias, String[] args) {
		return false;
	}
}
