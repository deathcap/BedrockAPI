package org.bukkit.event.player;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerTeleportEvent;


public class PlayerMoveEvent extends PlayerEvent implements Cancellable  {


	public PlayerMoveEvent(Player player, Location from, Location to) {
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}

	public Location getFrom() {
		return null;
	}

	public void setFrom(Location from) {
	}

	public Location getTo() {
		return null;
	}

	public void setTo(Location to) {
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
