package org.bukkit.command;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandMap;
import org.bukkit.command.CommandSender;


public class SimpleCommandMap extends Object implements CommandMap  {


	protected final Map<String,Command> knownCommands = null;

	public SimpleCommandMap(Server server) {
	}

	public void setFallbackCommands() {
	}

	public void registerAll(String fallbackPrefix, List<Command> commands) {
	}

	public boolean register(String fallbackPrefix, Command command) {
		return false;
	}

	public boolean register(String label, String fallbackPrefix, Command command) {
		return false;
	}

	public boolean dispatch(CommandSender sender, String commandLine) throws CommandException {
		return false;
	}

	public void clearCommands() {
	}

	public Command getCommand(String name) {
		return null;
	}

	public List<String> tabComplete(CommandSender sender, String cmdLine) {
		return null;
	}

	public Collection<Command> getCommands() {
		return null;
	}

	public void registerServerAliases() {
	}
}
