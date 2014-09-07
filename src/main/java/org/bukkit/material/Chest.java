package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.material.Chest;
import org.bukkit.material.Directional;
import org.bukkit.material.DirectionalContainer;
import org.bukkit.material.MaterialData;


public class Chest extends DirectionalContainer  {


	public Chest() {
        super(Material.CHEST);
	}

	public Chest(BlockFace direction) {
        super(Material.CHEST);
	}

	@Deprecated public Chest(int type) {
        super(Material.getMaterial(type));
	}

	public Chest(Material type) {
        super(type);
	}

	@Deprecated public Chest(int type, byte data) {
        super(Material.getMaterial(type));
	}

	@Deprecated public Chest(Material type, byte data) {
        super(type);
	}

	public Chest clone() {
		return null;
	}
}
