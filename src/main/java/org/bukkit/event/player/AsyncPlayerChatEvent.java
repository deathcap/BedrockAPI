package org.bukkit.event.player;

import java.util.IllegalFormatException;
import java.util.Set;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;


public class AsyncPlayerChatEvent extends PlayerEvent implements Cancellable  {


	public AsyncPlayerChatEvent(boolean async, Player who, String message, Set<Player> players) {
	}

	public String getMessage() {
		return null;
	}

	public void setMessage(String message) {
	}

	public String getFormat() {
		return null;
	}

	public void setFormat(String format) throws IllegalFormatException, NullPointerException {
	}

	public Set<Player> getRecipients() {
		return null;
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
