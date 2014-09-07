package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.material.Directional;
import org.bukkit.material.MaterialData;
import org.bukkit.material.Stairs;


public class Stairs extends MaterialData implements Directional  {


	@Deprecated public Stairs(int type) {
	}

	public Stairs(Material type) {
	}

	@Deprecated public Stairs(int type, byte data) {
	}

	@Deprecated public Stairs(Material type, byte data) {
	}

	public BlockFace getAscendingDirection() {
		return null;
	}

	public BlockFace getDescendingDirection() {
		return null;
	}

	public void setFacingDirection(BlockFace face) {
	}

	public BlockFace getFacing() {
		return null;
	}

	public boolean isInverted() {
		return false;
	}

	public void setInverted(boolean inv) {
	}

	public String toString() {
		return null;
	}

	public Stairs clone() {
		return null;
	}
}
