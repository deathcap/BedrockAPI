package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.material.Directional;
import org.bukkit.material.MaterialData;
import org.bukkit.material.PistonBaseMaterial;
import org.bukkit.material.Redstone;


public class PistonBaseMaterial extends MaterialData implements Directional, Redstone  {


	@Deprecated public PistonBaseMaterial(int type) {
	}

	public PistonBaseMaterial(Material type) {
	}

	@Deprecated public PistonBaseMaterial(int type, byte data) {
	}

	@Deprecated public PistonBaseMaterial(Material type, byte data) {
	}

	public void setFacingDirection(BlockFace face) {
	}

	public BlockFace getFacing() {
		return null;
	}

	public boolean isPowered() {
		return false;
	}

	public void setPowered(boolean powered) {
	}

	public boolean isSticky() {
		return false;
	}

	public PistonBaseMaterial clone() {
		return null;
	}
}
