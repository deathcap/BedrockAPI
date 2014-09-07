package org.bukkit.event.player;

import java.io.Serializable;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerFishEvent.State;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Fish;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerFishEvent.State;


public class PlayerFishEvent extends PlayerEvent implements Cancellable  {


	@Deprecated public PlayerFishEvent(Player player, Entity entity, PlayerFishEvent.State state) {
        super(player);
	}

	public PlayerFishEvent(Player player, Entity entity, Fish hookEntity, PlayerFishEvent.State state) {
        super(player);
	}

	public Entity getCaught() {
		return null;
	}

	public Fish getHook() {
		return null;
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}

	public int getExpToDrop() {
		return 0;
	}

	public void setExpToDrop(int amount) {
	}

	public PlayerFishEvent.State getState() {
		return null;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}

	
	
	
	public static enum State  {
	
		FISHING,
		CAUGHT_FISH,
		CAUGHT_ENTITY,
		IN_GROUND,
		FAILED_ATTEMPT,
		;
	}
}
