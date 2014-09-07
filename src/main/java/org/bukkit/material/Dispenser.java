package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.material.Directional;
import org.bukkit.material.DirectionalContainer;
import org.bukkit.material.Dispenser;
import org.bukkit.material.FurnaceAndDispenser;
import org.bukkit.material.MaterialData;


public class Dispenser extends FurnaceAndDispenser  {


	public Dispenser() {
	}

	public Dispenser(BlockFace direction) {
	}

	@Deprecated public Dispenser(int type) {
	}

	public Dispenser(Material type) {
	}

	@Deprecated public Dispenser(int type, byte data) {
	}

	@Deprecated public Dispenser(Material type, byte data) {
	}

	public void setFacingDirection(BlockFace face) {
	}

	public BlockFace getFacing() {
		return null;
	}

	public Dispenser clone() {
		return null;
	}
}
