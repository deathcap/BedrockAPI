package org.bukkit.event.inventory;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.block.BlockEvent;
import org.bukkit.event.block.BlockExpEvent;


public class FurnaceExtractEvent extends BlockExpEvent  {


	public FurnaceExtractEvent(Player player, Block block, Material itemType, int itemAmount, int exp) {
	}

	public Player getPlayer() {
		return null;
	}

	public Material getItemType() {
		return null;
	}

	public int getItemAmount() {
		return 0;
	}
}
