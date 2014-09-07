package org.bukkit.event.player;

import org.bukkit.entity.CreatureType;
import org.bukkit.entity.Egg;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;


public class PlayerEggThrowEvent extends PlayerEvent  {


	public Egg getEgg() {
		return null;
	}

	public boolean isHatching() {
		return false;
	}

	public void setHatching(boolean hatching) {
	}

	@Deprecated public CreatureType getHatchType() {
		return null;
	}

	public EntityType getHatchingType() {
		return null;
	}

	@Deprecated public void setHatchType(CreatureType hatchType) {
	}

	public void setHatchingType(EntityType hatchType) {
	}

	public byte getNumHatches() {
		return 0;
	}

	public void setNumHatches(byte numHatches) {
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
