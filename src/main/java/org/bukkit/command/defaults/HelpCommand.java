package org.bukkit.command.defaults;

import java.util.List;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.VanillaCommand;
import org.bukkit.help.HelpTopic;


public class HelpCommand extends VanillaCommand  {


	public HelpCommand() {
	}

	public boolean execute(CommandSender sender, String currentAlias, String[] args) {
		return false;
	}

	public List<String> tabComplete(CommandSender sender, String alias, String[] args) {
		return null;
	}

	protected HelpTopic findPossibleMatches(String searchString) {
		return null;
	}

	protected static int damerauLevenshteinDistance(String s1, String s2) {
		return 0;
	}
}
