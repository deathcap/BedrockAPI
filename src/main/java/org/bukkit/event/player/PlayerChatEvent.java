package org.bukkit.event.player;

import java.util.Set;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;


@Deprecated public class PlayerChatEvent extends PlayerEvent implements Cancellable  {


	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}

	public String getMessage() {
		return null;
	}

	public void setMessage(String message) {
	}

	public void setPlayer(Player player) {
	}

	public String getFormat() {
		return null;
	}

	public void setFormat(String format) {
	}

	public Set<Player> getRecipients() {
		return null;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
