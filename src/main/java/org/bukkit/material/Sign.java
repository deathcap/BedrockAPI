package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.material.Attachable;
import org.bukkit.material.Directional;
import org.bukkit.material.MaterialData;
import org.bukkit.material.Sign;


public class Sign extends MaterialData implements Attachable  {


	public boolean isWallSign() {
		return false;
	}

	public BlockFace getAttachedFace() {
		return null;
	}

	public BlockFace getFacing() {
		return null;
	}

	public void setFacingDirection(BlockFace face) {
	}

	public String toString() {
		return null;
	}

	public Sign clone() {
		return null;
	}
}
