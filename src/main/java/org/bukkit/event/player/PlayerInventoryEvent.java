package org.bukkit.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.Inventory;


@Deprecated public class PlayerInventoryEvent extends PlayerEvent  {


	protected Inventory inventory = null;

	public PlayerInventoryEvent(Player player, Inventory inventory) {
        super(player);
	}

	public Inventory getInventory() {
		return null;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
