package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.material.Attachable;
import org.bukkit.material.Directional;
import org.bukkit.material.MaterialData;
import org.bukkit.material.Sign;


public class Sign extends MaterialData implements Attachable  {


	public Sign() {
	}

	@Deprecated public Sign(int type) {
	}

	public Sign(Material type) {
	}

	@Deprecated public Sign(int type, byte data) {
	}

	@Deprecated public Sign(Material type, byte data) {
	}

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
