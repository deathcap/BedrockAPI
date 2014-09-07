package org.bukkit.event.player;

import org.bukkit.Material;
import org.bukkit.Statistic;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;


public class PlayerStatisticIncrementEvent extends PlayerEvent implements Cancellable  {


	protected final Statistic statistic = null;

	public PlayerStatisticIncrementEvent(Player player, Statistic statistic, int initialValue, int newValue) {
	}

	public PlayerStatisticIncrementEvent(Player player, Statistic statistic, int initialValue, int newValue, EntityType entityType) {
	}

	public PlayerStatisticIncrementEvent(Player player, Statistic statistic, int initialValue, int newValue, Material material) {
	}

	public Statistic getStatistic() {
		return null;
	}

	public int getPreviousValue() {
		return 0;
	}

	public int getNewValue() {
		return 0;
	}

	public EntityType getEntityType() {
		return null;
	}

	public Material getMaterial() {
		return null;
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
