package org.bukkit.event.player;

import java.io.Serializable;
import org.bukkit.event.player.PlayerPreLoginEvent;
import org.bukkit.event.player.PlayerPreLoginEvent.Result;
import java.net.InetAddress;
import java.util.UUID;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerPreLoginEvent.Result;


@Deprecated public class PlayerPreLoginEvent extends Event  {


	public PlayerPreLoginEvent.Result getResult() {
		return null;
	}

	public void setResult(PlayerPreLoginEvent.Result result) {
	}

	public String getKickMessage() {
		return null;
	}

	public void setKickMessage(String message) {
	}

	public void allow() {
	}

	public void disallow(PlayerPreLoginEvent.Result result, String message) {
	}

	public String getName() {
		return null;
	}

	public InetAddress getAddress() {
		return null;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public UUID getUniqueId() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}

	
	
	
	public static enum Result  {
	
		ALLOWED,
		KICK_FULL,
		KICK_BANNED,
		KICK_WHITELIST,
		KICK_OTHER,
		;
	
	
	}
}
