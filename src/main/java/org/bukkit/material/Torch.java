package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.material.Attachable;
import org.bukkit.material.Directional;
import org.bukkit.material.MaterialData;
import org.bukkit.material.RedstoneTorch;
import org.bukkit.material.SimpleAttachableMaterialData;
import org.bukkit.material.Torch;


public class Torch extends SimpleAttachableMaterialData  {


	public BlockFace getAttachedFace() {
		return null;
	}

	public void setFacingDirection(BlockFace face) {
	}

	public Torch clone() {
		return null;
	}
}
