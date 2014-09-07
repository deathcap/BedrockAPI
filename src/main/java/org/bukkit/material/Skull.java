package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.material.Directional;
import org.bukkit.material.MaterialData;
import org.bukkit.material.Skull;


public class Skull extends MaterialData implements Directional  {


	public Skull() {
	}

	public Skull(BlockFace direction) {
	}

	@Deprecated public Skull(int type) {
	}

	public Skull(Material type) {
	}

	@Deprecated public Skull(int type, byte data) {
	}

	@Deprecated public Skull(Material type, byte data) {
	}

	public void setFacingDirection(BlockFace face) {
	}

	public BlockFace getFacing() {
		return null;
	}

	public String toString() {
		return null;
	}

	public Skull clone() {
		return null;
	}
}
