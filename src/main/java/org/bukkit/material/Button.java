package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.material.Attachable;
import org.bukkit.material.Button;
import org.bukkit.material.Directional;
import org.bukkit.material.MaterialData;
import org.bukkit.material.Redstone;
import org.bukkit.material.SimpleAttachableMaterialData;


public class Button extends SimpleAttachableMaterialData implements Redstone  {


	public boolean isPowered() {
		return false;
	}

	public void setPowered(boolean bool) {
	}

	public BlockFace getAttachedFace() {
		return null;
	}

	public void setFacingDirection(BlockFace face) {
	}

	public String toString() {
		return null;
	}

	public Button clone() {
		return null;
	}
}
