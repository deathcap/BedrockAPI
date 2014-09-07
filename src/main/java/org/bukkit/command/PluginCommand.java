package org.bukkit.command;

import java.util.List;
import org.bukkit.command.Command;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginIdentifiableCommand;
import org.bukkit.command.TabCompleter;
import org.bukkit.plugin.Plugin;


public final class PluginCommand extends Command implements PluginIdentifiableCommand  {


	protected PluginCommand(String name, Plugin owner) {
	}

	public boolean execute(CommandSender sender, String commandLabel, String[] args) {
		return false;
	}

	public void setExecutor(CommandExecutor executor) {
	}

	public CommandExecutor getExecutor() {
		return null;
	}

	public void setTabCompleter(TabCompleter completer) {
	}

	public TabCompleter getTabCompleter() {
		return null;
	}

	public Plugin getPlugin() {
		return null;
	}

	public List<String> tabComplete(CommandSender sender, String alias, String[] args) throws CommandException, IllegalArgumentException {
		return null;
	}

	public String toString() {
		return null;
	}
}
