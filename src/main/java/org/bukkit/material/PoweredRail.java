package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.material.ExtendedRails;
import org.bukkit.material.MaterialData;
import org.bukkit.material.PoweredRail;
import org.bukkit.material.Rails;
import org.bukkit.material.Redstone;


public class PoweredRail extends ExtendedRails implements Redstone  {


	public PoweredRail() {
	}

	@Deprecated public PoweredRail(int type) {
	}

	public PoweredRail(Material type) {
	}

	@Deprecated public PoweredRail(int type, byte data) {
	}

	@Deprecated public PoweredRail(Material type, byte data) {
	}

	public boolean isPowered() {
		return false;
	}

	public void setPowered(boolean isPowered) {
	}

	public PoweredRail clone() {
		return null;
	}
}
