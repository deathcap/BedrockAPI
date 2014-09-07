package org.bukkit.event.player;

import org.bukkit.Location;
import org.bukkit.TravelAgent;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;


public class PlayerPortalEvent extends PlayerTeleportEvent  {


	protected boolean useTravelAgent = false;

	protected TravelAgent travelAgent = null;

	public PlayerPortalEvent(Player player, Location from, Location to, TravelAgent pta) {
        super(player, from, to);
	}

	public PlayerPortalEvent(Player player, Location from, Location to, TravelAgent pta, PlayerTeleportEvent.TeleportCause cause) {
        super(player, from, to);
	}

	public void useTravelAgent(boolean useTravelAgent) {
	}

	public boolean useTravelAgent() {
		return false;
	}

	public TravelAgent getPortalTravelAgent() {
		return null;
	}

	public void setPortalTravelAgent(TravelAgent travelAgent) {
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
