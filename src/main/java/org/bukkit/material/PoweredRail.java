package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.material.ExtendedRails;
import org.bukkit.material.MaterialData;
import org.bukkit.material.PoweredRail;
import org.bukkit.material.Rails;
import org.bukkit.material.Redstone;


public class PoweredRail extends ExtendedRails implements Redstone  {


	public PoweredRail() {
       super(Material.POWERED_RAIL);
	}

	@Deprecated public PoweredRail(int type) {
        super(Material.getMaterial(type));
	}

	public PoweredRail(Material type) {
        super(type);
	}

	@Deprecated public PoweredRail(int type, byte data) {
        super(Material.getMaterial(type));
	}

	@Deprecated public PoweredRail(Material type, byte data) {
        super(type);
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
