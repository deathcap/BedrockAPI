package org.bukkit.command;

import java.util.List;
import org.bukkit.command.Command;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandSender;
import org.bukkit.command.SimpleCommandMap;


public interface CommandMap  {


	void registerAll(String fallbackPrefix, List<Command> commands);

	boolean register(String label, String fallbackPrefix, Command command);

	boolean register(String fallbackPrefix, Command command);

	boolean dispatch(CommandSender sender, String cmdLine) throws CommandException;

	void clearCommands();

	Command getCommand(String name);

	List<String> tabComplete(CommandSender sender, String cmdLine) throws IllegalArgumentException;
}
