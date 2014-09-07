package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.material.ExtendedRails;
import org.bukkit.material.MaterialData;
import org.bukkit.material.Rails;


public class Rails extends MaterialData  {


	public Rails() {
	}

	@Deprecated public Rails(int type) {
	}

	public Rails(Material type) {
	}

	@Deprecated public Rails(int type, byte data) {
	}

	@Deprecated public Rails(Material type, byte data) {
	}

	public boolean isOnSlope() {
		return false;
	}

	public boolean isCurve() {
		return false;
	}

	public BlockFace getDirection() {
		return null;
	}

	public String toString() {
		return null;
	}

	@Deprecated protected byte getConvertedData() {
		return 0;
	}

	public void setDirection(BlockFace face, boolean isOnSlope) {
	}

	public Rails clone() {
		return null;
	}
}
