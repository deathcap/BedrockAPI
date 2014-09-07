package org.bukkit.event.entity;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;


public class PlayerLeashEntityEvent extends Event implements Cancellable  {


	public PlayerLeashEntityEvent(Entity what, Entity leashHolder, Player leasher) {
	}

	public Entity getLeashHolder() {
		return null;
	}

	public Entity getEntity() {
		return null;
	}

	public final Player getPlayer() {
		return null;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}
}
