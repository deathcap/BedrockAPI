package org.bukkit.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;


public class FormattedCommandAlias extends Command  {


	public FormattedCommandAlias(String alias, String[] formatStrings) {
        super(alias);
	}

	public boolean execute(CommandSender sender, String commandLabel, String[] args) {
		return false;
	}
}
