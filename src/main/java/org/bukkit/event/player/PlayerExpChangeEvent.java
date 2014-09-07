package org.bukkit.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;


public class PlayerExpChangeEvent extends PlayerEvent  {


	public PlayerExpChangeEvent(Player player, int expAmount) {
        super(player);
	}

	public int getAmount() {
		return 0;
	}

	public void setAmount(int amount) {
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
