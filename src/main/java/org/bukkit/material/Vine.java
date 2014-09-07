package org.bukkit.material;

import java.util.EnumSet;
import org.bukkit.block.BlockFace;
import org.bukkit.material.MaterialData;
import org.bukkit.material.Vine;


public class Vine extends MaterialData  {


	public Vine() {
	}

	@Deprecated public Vine(int type, byte data) {
	}

	@Deprecated public Vine(byte data) {
	}

	public Vine(BlockFace... faces) {
	}

	public Vine(EnumSet<BlockFace> faces) {
	}

	public boolean isOnFace(BlockFace face) {
		return false;
	}

	public void putOnFace(BlockFace face) {
	}

	public void removeFromFace(BlockFace face) {
	}

	public String toString() {
		return null;
	}

	public Vine clone() {
		return null;
	}
}
