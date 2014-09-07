package org.bukkit.command.defaults;

import java.util.List;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.VanillaCommand;


public class DifficultyCommand extends VanillaCommand  {


	public DifficultyCommand() {
        super("Difficulty");
	}

	public boolean execute(CommandSender sender, String currentAlias, String[] args) {
		return false;
	}

	protected int getDifficultyForString(CommandSender sender, String name) {
		return 0;
	}

	public List<String> tabComplete(CommandSender sender, String alias, String[] args) {
		return null;
	}
}
