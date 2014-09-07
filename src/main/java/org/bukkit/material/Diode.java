package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.material.Diode;
import org.bukkit.material.Directional;
import org.bukkit.material.MaterialData;


public class Diode extends MaterialData implements Directional  {


	public Diode() {
	}

	@Deprecated public Diode(int type) {
	}

	public Diode(Material type) {
	}

	@Deprecated public Diode(int type, byte data) {
	}

	@Deprecated public Diode(Material type, byte data) {
	}

	public void setDelay(int delay) {
	}

	public int getDelay() {
		return 0;
	}

	public void setFacingDirection(BlockFace face) {
	}

	public BlockFace getFacing() {
		return null;
	}

	public String toString() {
		return null;
	}

	public Diode clone() {
		return null;
	}
}
