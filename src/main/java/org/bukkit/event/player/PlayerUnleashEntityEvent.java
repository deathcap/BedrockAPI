package org.bukkit.event.player;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.event.entity.EntityUnleashEvent;
import org.bukkit.event.entity.EntityUnleashEvent.UnleashReason;


public class PlayerUnleashEntityEvent extends EntityUnleashEvent implements Cancellable  {


	public PlayerUnleashEntityEvent(Entity entity, Player player) {
        super(entity, UnleashReason.PLAYER_UNLEASH);
	}

	public Player getPlayer() {
		return null;
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}
}
