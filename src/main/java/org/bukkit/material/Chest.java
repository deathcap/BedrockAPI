package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.material.Chest;
import org.bukkit.material.Directional;
import org.bukkit.material.DirectionalContainer;
import org.bukkit.material.MaterialData;


public class Chest extends DirectionalContainer  {


	public Chest() {
	}

	public Chest(BlockFace direction) {
	}

	@Deprecated public Chest(int type) {
	}

	public Chest(Material type) {
	}

	@Deprecated public Chest(int type, byte data) {
	}

	@Deprecated public Chest(Material type, byte data) {
	}

	public Chest clone() {
		return null;
	}
}
