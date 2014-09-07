package org.bukkit.event.world;

import java.util.List;
import org.bukkit.Location;
import org.bukkit.TreeType;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.world.WorldEvent;


public class StructureGrowEvent extends WorldEvent implements Cancellable  {


	public StructureGrowEvent(Location location, TreeType species, boolean bonemeal, Player player, List<BlockState> blocks) {
        super(location.getWorld());
	}

	public Location getLocation() {
		return null;
	}

	public TreeType getSpecies() {
		return null;
	}

	public boolean isFromBonemeal() {
		return false;
	}

	public Player getPlayer() {
		return null;
	}

	public List<BlockState> getBlocks() {
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
