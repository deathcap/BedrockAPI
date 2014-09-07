package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.material.Attachable;
import org.bukkit.material.Directional;
import org.bukkit.material.MaterialData;
import org.bukkit.material.PistonExtensionMaterial;


public class PistonExtensionMaterial extends MaterialData implements Attachable  {


	@Deprecated public PistonExtensionMaterial(int type) {
	}

	public PistonExtensionMaterial(Material type) {
	}

	@Deprecated public PistonExtensionMaterial(int type, byte data) {
	}

	@Deprecated public PistonExtensionMaterial(Material type, byte data) {
	}

	public void setFacingDirection(BlockFace face) {
	}

	public BlockFace getFacing() {
		return null;
	}

	public boolean isSticky() {
		return false;
	}

	public void setSticky(boolean sticky) {
	}

	public BlockFace getAttachedFace() {
		return null;
	}

	public PistonExtensionMaterial clone() {
		return null;
	}
}
