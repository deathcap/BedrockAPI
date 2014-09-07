package org.bukkit.material;

import org.bukkit.block.BlockFace;
import org.bukkit.material.Directional;
import org.bukkit.material.Gate;
import org.bukkit.material.MaterialData;
import org.bukkit.material.Openable;


public class Gate extends MaterialData implements Directional, Openable  {


	public void setFacingDirection(BlockFace face) {
	}

	public BlockFace getFacing() {
		return null;
	}

	public boolean isOpen() {
		return false;
	}

	public void setOpen(boolean isOpen) {
	}

	public String toString() {
		return null;
	}

	public Gate clone() {
		return null;
	}
}
