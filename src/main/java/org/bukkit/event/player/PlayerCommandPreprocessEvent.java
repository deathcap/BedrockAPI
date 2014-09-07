package org.bukkit.event.player;

import java.util.Set;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;


public class PlayerCommandPreprocessEvent extends PlayerEvent implements Cancellable  {


	public PlayerCommandPreprocessEvent(Player player, String message) {
	}

	public PlayerCommandPreprocessEvent(Player player, String message, Set<Player> recipients) {
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}

	public String getMessage() {
		return null;
	}

	public void setMessage(String command) throws IllegalArgumentException {
	}

	public void setPlayer(Player player) throws IllegalArgumentException {
	}

	@Deprecated public String getFormat() {
		return null;
	}

	@Deprecated public void setFormat(String format) {
	}

	@Deprecated public Set<Player> getRecipients() {
		return null;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
