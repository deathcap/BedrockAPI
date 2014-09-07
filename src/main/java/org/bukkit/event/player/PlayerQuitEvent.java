package org.bukkit.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;


public class PlayerQuitEvent extends PlayerEvent  {


	public PlayerQuitEvent(Player who, String quitMessage) {
        super(who);
	}

	public String getQuitMessage() {
		return null;
	}

	public void setQuitMessage(String quitMessage) {
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
