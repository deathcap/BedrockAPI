package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.material.Directional;
import org.bukkit.material.DirectionalContainer;
import org.bukkit.material.EnderChest;
import org.bukkit.material.MaterialData;


public class EnderChest extends DirectionalContainer  {


	public EnderChest() {
	}

	public EnderChest(BlockFace direction) {
	}

	@Deprecated public EnderChest(int type) {
	}

	public EnderChest(Material type) {
	}

	@Deprecated public EnderChest(int type, byte data) {
	}

	@Deprecated public EnderChest(Material type, byte data) {
	}

	public EnderChest clone() {
		return null;
	}
}
