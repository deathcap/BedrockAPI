package org.bukkit.material;

import org.bukkit.block.BlockFace;
import org.bukkit.material.Attachable;
import org.bukkit.material.Directional;
import org.bukkit.material.MaterialData;
import org.bukkit.material.Redstone;
import org.bukkit.material.SimpleAttachableMaterialData;
import org.bukkit.material.TripwireHook;


public class TripwireHook extends SimpleAttachableMaterialData implements Redstone  {


	public boolean isConnected() {
		return false;
	}

	public void setConnected(boolean connected) {
	}

	public boolean isActivated() {
		return false;
	}

	public void setActivated(boolean act) {
	}

	public void setFacingDirection(BlockFace face) {
	}

	public BlockFace getAttachedFace() {
		return null;
	}

	public boolean isPowered() {
		return false;
	}

	public TripwireHook clone() {
		return null;
	}

	public String toString() {
		return null;
	}
}
