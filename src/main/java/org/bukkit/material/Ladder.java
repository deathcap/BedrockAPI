package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.material.Attachable;
import org.bukkit.material.Directional;
import org.bukkit.material.Ladder;
import org.bukkit.material.MaterialData;
import org.bukkit.material.SimpleAttachableMaterialData;


public class Ladder extends SimpleAttachableMaterialData  {


	public Ladder() {
	}

	@Deprecated public Ladder(int type) {
	}

	public Ladder(Material type) {
	}

	@Deprecated public Ladder(int type, byte data) {
	}

	@Deprecated public Ladder(Material type, byte data) {
	}

	public BlockFace getAttachedFace() {
		return null;
	}

	public void setFacingDirection(BlockFace face) {
	}

	public Ladder clone() {
		return null;
	}
}
