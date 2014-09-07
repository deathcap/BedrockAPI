package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.material.DetectorRail;
import org.bukkit.material.ExtendedRails;
import org.bukkit.material.MaterialData;
import org.bukkit.material.PoweredRail;
import org.bukkit.material.Rails;


public class ExtendedRails extends Rails  {


	public boolean isCurve() {
		return false;
	}

	@Deprecated protected byte getConvertedData() {
		return 0;
	}

	public void setDirection(BlockFace face, boolean isOnSlope) {
	}

	public ExtendedRails clone() {
		return null;
	}
}
