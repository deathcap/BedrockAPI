package org.bukkit.event.player;

import java.util.Collection;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;


public class PlayerChatTabCompleteEvent extends PlayerEvent  {


	public String getChatMessage() {
		return null;
	}

	public String getLastToken() {
		return null;
	}

	public Collection<String> getTabCompletions() {
		return null;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
