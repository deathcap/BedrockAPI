package org.bukkit.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.util.Vector;


public class PlayerVelocityEvent extends PlayerEvent implements Cancellable  {


	public PlayerVelocityEvent(Player player, Vector velocity) {
        super(player);
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}

	public Vector getVelocity() {
		return null;
	}

	public void setVelocity(Vector velocity) {
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
