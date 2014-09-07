package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.material.Directional;
import org.bukkit.material.Door;
import org.bukkit.material.MaterialData;
import org.bukkit.material.Openable;


@Deprecated public class Door extends MaterialData implements Directional, Openable  {


	@Deprecated public boolean isOpen() {
		return false;
	}

	@Deprecated public void setOpen(boolean isOpen) {
	}

	public boolean isTopHalf() {
		return false;
	}

	@Deprecated public void setTopHalf(boolean isTopHalf) {
	}

	@Deprecated public BlockFace getHingeCorner() {
		return null;
	}

	public String toString() {
		return null;
	}

	@Deprecated public void setFacingDirection(BlockFace face) {
	}

	@Deprecated public BlockFace getFacing() {
		return null;
	}

	public Door clone() {
		return null;
	}
}
