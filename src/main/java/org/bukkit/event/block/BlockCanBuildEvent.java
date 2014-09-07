package org.bukkit.event.block;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.BlockEvent;


public class BlockCanBuildEvent extends BlockEvent  {


	public boolean isBuildable() {
		return false;
	}

	public void setBuildable(boolean cancel) {
	}

	public Material getMaterial() {
		return null;
	}

	@Deprecated public int getMaterialId() {
		return 0;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
