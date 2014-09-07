package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;
import org.bukkit.material.Redstone;
import org.bukkit.material.RedstoneWire;


public class RedstoneWire extends MaterialData implements Redstone  {


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
