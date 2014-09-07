package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;
import org.bukkit.material.Redstone;
import org.bukkit.material.RedstoneWire;


public class RedstoneWire extends MaterialData implements Redstone  {


	public RedstoneWire() {
	}

	@Deprecated public RedstoneWire(int type) {
	}

	public RedstoneWire(Material type) {
	}

	@Deprecated public RedstoneWire(int type, byte data) {
	}

	@Deprecated public RedstoneWire(Material type, byte data) {
	}

	public boolean isPowered() {
		return false;
	}

	public String toString() {
		return null;
	}

	public RedstoneWire clone() {
		return null;
	}
}
