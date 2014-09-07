package org.bukkit.help;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.help.HelpTopic;


public class GenericCommandHelpTopic extends HelpTopic  {


	protected Command command = null;

	public GenericCommandHelpTopic(Command command) {
	}

	public boolean canSee(CommandSender sender) {
		return false;
	}
}
