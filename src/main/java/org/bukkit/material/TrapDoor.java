package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.material.Attachable;
import org.bukkit.material.Directional;
import org.bukkit.material.MaterialData;
import org.bukkit.material.Openable;
import org.bukkit.material.SimpleAttachableMaterialData;
import org.bukkit.material.TrapDoor;


public class TrapDoor extends SimpleAttachableMaterialData implements Openable  {


	public boolean isOpen() {
		return false;
	}

	public void setOpen(boolean isOpen) {
	}

	public boolean isInverted() {
		return false;
	}

	public void setInverted(boolean inv) {
	}

	public BlockFace getAttachedFace() {
		return null;
	}

	public void setFacingDirection(BlockFace face) {
	}

	public String toString() {
		return null;
	}

	public TrapDoor clone() {
		return null;
	}
}
