package org.bukkit.event.server;

import org.bukkit.command.CommandSender;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.server.ServerCommandEvent;
import org.bukkit.event.server.ServerEvent;


public class RemoteServerCommandEvent extends ServerCommandEvent  {


	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
