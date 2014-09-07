package org.bukkit.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.meta.BookMeta;


public class PlayerEditBookEvent extends PlayerEvent implements Cancellable  {


	public PlayerEditBookEvent(Player who, int slot, BookMeta previousBookMeta, BookMeta newBookMeta, boolean isSigning) {
	}

	public BookMeta getPreviousBookMeta() {
		return null;
	}

	public BookMeta getNewBookMeta() {
		return null;
	}

	public int getSlot() {
		return 0;
	}

	public void setNewBookMeta(BookMeta newBookMeta) throws IllegalArgumentException {
	}

	public boolean isSigning() {
		return false;
	}

	public void setSigning(boolean signing) {
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
