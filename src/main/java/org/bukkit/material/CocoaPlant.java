package org.bukkit.material;

import java.io.Serializable;
import org.bukkit.material.CocoaPlant;
import org.bukkit.material.CocoaPlant.CocoaPlantSize;
import org.bukkit.block.BlockFace;
import org.bukkit.material.Attachable;
import org.bukkit.material.CocoaPlant;
import org.bukkit.material.CocoaPlant.CocoaPlantSize;
import org.bukkit.material.Directional;
import org.bukkit.material.MaterialData;


public class CocoaPlant extends MaterialData implements Directional, Attachable  {


	public CocoaPlant() {
	}

	@Deprecated public CocoaPlant(int type) {
	}

	@Deprecated public CocoaPlant(int type, byte data) {
	}

	public CocoaPlant(CocoaPlant.CocoaPlantSize sz) {
	}

	public CocoaPlant(CocoaPlant.CocoaPlantSize sz, BlockFace dir) {
	}

	public CocoaPlant.CocoaPlantSize getSize() {
		return null;
	}

	public void setSize(CocoaPlant.CocoaPlantSize sz) {
	}

	public BlockFace getAttachedFace() {
		return null;
	}

	public void setFacingDirection(BlockFace face) {
	}

	public BlockFace getFacing() {
		return null;
	}

	public CocoaPlant clone() {
		return null;
	}

	public String toString() {
		return null;
	}

	
	
	
	public static enum CocoaPlantSize  {
	
		SMALL,
		MEDIUM,
		LARGE,
		;
	}
}
