package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.material.Attachable;
import org.bukkit.material.Directional;
import org.bukkit.material.MaterialData;
import org.bukkit.material.Redstone;
import org.bukkit.material.RedstoneTorch;
import org.bukkit.material.SimpleAttachableMaterialData;
import org.bukkit.material.Torch;


public class RedstoneTorch extends Torch implements Redstone  {


	public RedstoneTorch() {
	}

	@Deprecated public RedstoneTorch(int type) {
	}

	public RedstoneTorch(Material type) {
	}

	@Deprecated public RedstoneTorch(int type, byte data) {
	}

	@Deprecated public RedstoneTorch(Material type, byte data) {
	}

	public boolean isPowered() {
		return false;
	}

	public String toString() {
		return null;
	}

	public RedstoneTorch clone() {
		return null;
	}
}
