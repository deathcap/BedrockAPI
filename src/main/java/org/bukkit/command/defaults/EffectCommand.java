package org.bukkit.command.defaults;

import java.util.List;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.VanillaCommand;


public class EffectCommand extends VanillaCommand  {


	public boolean execute(CommandSender sender, String commandLabel, String[] args) {
		return false;
	}

	public List<String> tabComplete(CommandSender sender, String commandLabel, String[] args) {
		return null;
	}
}