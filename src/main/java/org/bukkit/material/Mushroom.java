package org.bukkit.material;

import java.util.Set;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.material.MaterialData;
import org.bukkit.material.Mushroom;


public class Mushroom extends MaterialData  {


	public Mushroom(Material shroom) {
	}

	@Deprecated public Mushroom(Material shroom, byte data) {
	}

	@Deprecated public Mushroom(int type, byte data) {
	}

	public boolean isStem() {
		return false;
	}

	public void setStem() {
	}

	public boolean isFacePainted(BlockFace face) {
		return false;
	}

	public void setFacePainted(BlockFace face, boolean painted) {
	}

	public Set<BlockFace> getPaintedFaces() {
		return null;
	}

	public String toString() {
		return null;
	}

	public Mushroom clone() {
		return null;
	}
}
