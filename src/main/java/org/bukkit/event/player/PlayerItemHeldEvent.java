package org.bukkit.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;


public class PlayerItemHeldEvent extends PlayerEvent implements Cancellable  {


	public PlayerItemHeldEvent(Player player, int previous, int current) {
        super(player);
	}

	public int getPreviousSlot() {
		return 0;
	}

	public int getNewSlot() {
		return 0;
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
