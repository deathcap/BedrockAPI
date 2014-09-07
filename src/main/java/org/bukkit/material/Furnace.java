package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.material.Directional;
import org.bukkit.material.DirectionalContainer;
import org.bukkit.material.Furnace;
import org.bukkit.material.FurnaceAndDispenser;
import org.bukkit.material.MaterialData;


public class Furnace extends FurnaceAndDispenser  {


	public Furnace() {
	}

	public Furnace(BlockFace direction) {
	}

	@Deprecated public Furnace(int type) {
	}

	public Furnace(Material type) {
	}

	@Deprecated public Furnace(int type, byte data) {
	}

	@Deprecated public Furnace(Material type, byte data) {
	}

	public Furnace clone() {
		return null;
	}
}
