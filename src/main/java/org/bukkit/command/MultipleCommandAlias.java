package org.bukkit.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;


public class MultipleCommandAlias extends Command  {


	public MultipleCommandAlias(String name, Command[] commands) {
        super(name);
	}

	public Command[] getCommands() {
		return null;
	}

	public boolean execute(CommandSender sender, String commandLabel, String[] args) {
		return false;
	}
}
