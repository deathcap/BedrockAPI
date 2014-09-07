package org.bukkit.event.player;

import java.io.Serializable;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerPortalEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;


public class PlayerTeleportEvent extends PlayerMoveEvent  {


	public PlayerTeleportEvent(Player player, Location from, Location to) {
	}

	public PlayerTeleportEvent(Player player, Location from, Location to, PlayerTeleportEvent.TeleportCause cause) {
	}

	public PlayerTeleportEvent.TeleportCause getCause() {
		return null;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}

	
	
	
	public static enum TeleportCause  {
	
		ENDER_PEARL,
		COMMAND,
		PLUGIN,
		NETHER_PORTAL,
		END_PORTAL,
		UNKNOWN,
		;
	}
}
