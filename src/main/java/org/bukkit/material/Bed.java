package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.material.Bed;
import org.bukkit.material.Directional;
import org.bukkit.material.MaterialData;


public class Bed extends MaterialData implements Directional  {


	public Bed() {
	}

	public Bed(BlockFace direction) {
	}

	@Deprecated public Bed(int type) {
	}

	public Bed(Material type) {
	}

	@Deprecated public Bed(int type, byte data) {
	}

	@Deprecated public Bed(Material type, byte data) {
	}

	public boolean isHeadOfBed() {
		return false;
	}

	public void setHeadOfBed(boolean isHeadOfBed) {
	}

	public void setFacingDirection(BlockFace face) {
	}

	public BlockFace getFacing() {
		return null;
	}

	public String toString() {
		return null;
	}

	public Bed clone() {
		return null;
	}
}
