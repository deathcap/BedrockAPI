package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.material.Directional;
import org.bukkit.material.MaterialData;
import org.bukkit.material.Pumpkin;


public class Pumpkin extends MaterialData implements Directional  {


	public Pumpkin() {
	}

	public Pumpkin(BlockFace direction) {
	}

	@Deprecated public Pumpkin(int type) {
	}

	public Pumpkin(Material type) {
	}

	@Deprecated public Pumpkin(int type, byte data) {
	}

	@Deprecated public Pumpkin(Material type, byte data) {
	}

	public boolean isLit() {
		return false;
	}

	public void setFacingDirection(BlockFace face) {
	}

	public BlockFace getFacing() {
		return null;
	}

	public String toString() {
		return null;
	}

	public Pumpkin clone() {
		return null;
	}
}
