package org.bukkit.command.defaults;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.VanillaCommand;


public class MeCommand extends VanillaCommand  {


	public MeCommand() {
        super("Me");
	}

	public boolean execute(CommandSender sender, String currentAlias, String[] args) {
		return false;
	}
}
