package org.bukkit.event.server;

import java.net.InetAddress;
import java.util.Iterator;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.server.ServerEvent;
import org.bukkit.util.CachedServerIcon;


public class ServerListPingEvent extends ServerEvent implements Iterable<Player>  {


	public InetAddress getAddress() {
		return null;
	}

	public String getMotd() {
		return null;
	}

	public void setMotd(String motd) {
	}

	public int getNumPlayers() {
		return 0;
	}

	public int getMaxPlayers() {
		return 0;
	}

	public void setMaxPlayers(int maxPlayers) {
	}

	public void setServerIcon(CachedServerIcon icon) throws IllegalArgumentException, UnsupportedOperationException {
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}

	public Iterator<Player> iterator() throws UnsupportedOperationException {
		return null;
	}
}
