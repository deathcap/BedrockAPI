package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.material.Chest;
import org.bukkit.material.Directional;
import org.bukkit.material.DirectionalContainer;
import org.bukkit.material.EnderChest;
import org.bukkit.material.FurnaceAndDispenser;
import org.bukkit.material.MaterialData;


public class DirectionalContainer extends MaterialData implements Directional  {


	public void setFacingDirection(BlockFace face) {
	}

	public BlockFace getFacing() {
		return null;
	}

	public String toString() {
		return null;
	}

	public DirectionalContainer clone() {
		return null;
	}
}