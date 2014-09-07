package org.bukkit.command;

import org.bukkit.Server;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.RemoteConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.minecart.CommandMinecart;
import org.bukkit.permissions.Permissible;
import org.bukkit.permissions.ServerOperator;


public interface CommandSender extends Permissible  {


	void sendMessage(String message);

	void sendMessage(String[] messages);

	Server getServer();

	String getName();
}
