package org.bukkit.event.server;

import org.bukkit.command.CommandSender;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.server.RemoteServerCommandEvent;
import org.bukkit.event.server.ServerEvent;


public class ServerCommandEvent extends ServerEvent  {


	public ServerCommandEvent(CommandSender sender, String command) {
	}

	public String getCommand() {
		return null;
	}

	public void setCommand(String message) {
	}

	public CommandSender getSender() {
		return null;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
