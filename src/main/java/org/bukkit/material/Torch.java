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


	public Torch() {
	}

	@Deprecated public Torch(int type) {
	}

	public Torch(Material type) {
	}

	@Deprecated public Torch(int type, byte data) {
	}

	@Deprecated public Torch(Material type, byte data) {
	}

	public BlockFace getAttachedFace() {
		return null;
	}

	public void setFacingDirection(BlockFace face) {
	}

	public Torch clone() {
		return null;
	}
}
