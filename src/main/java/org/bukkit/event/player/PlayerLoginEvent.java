package org.bukkit.event.player;

import java.io.Serializable;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerLoginEvent.Result;
import java.net.InetAddress;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerLoginEvent.Result;


public class PlayerLoginEvent extends PlayerEvent  {


	@Deprecated public PlayerLoginEvent(Player player) {
	}

	@Deprecated public PlayerLoginEvent(Player player, String hostname) {
	}

	public PlayerLoginEvent(Player player, String hostname, InetAddress address) {
	}

	@Deprecated public PlayerLoginEvent(Player player, PlayerLoginEvent.Result result, String message) {
	}

	public PlayerLoginEvent(Player player, String hostname, InetAddress address, PlayerLoginEvent.Result result, String message) {
	}

	public PlayerLoginEvent.Result getResult() {
		return null;
	}

	public void setResult(PlayerLoginEvent.Result result) {
	}

	public String getKickMessage() {
		return null;
	}

	public void setKickMessage(String message) {
	}

	public String getHostname() {
		return null;
	}

	public void allow() {
	}

	public void disallow(PlayerLoginEvent.Result result, String message) {
	}

	public InetAddress getAddress() {
		return null;
	}

	public HandlerList getHandlers() {
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
