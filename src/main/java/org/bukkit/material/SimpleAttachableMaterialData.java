package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.material.Attachable;
import org.bukkit.material.Button;
import org.bukkit.material.Directional;
import org.bukkit.material.Ladder;
import org.bukkit.material.Lever;
import org.bukkit.material.MaterialData;
import org.bukkit.material.SimpleAttachableMaterialData;
import org.bukkit.material.Torch;
import org.bukkit.material.TrapDoor;
import org.bukkit.material.TripwireHook;


public abstract class SimpleAttachableMaterialData extends MaterialData implements Attachable  {

    public SimpleAttachableMaterialData() {
        // TODO
    }

	@Deprecated public SimpleAttachableMaterialData(int type) {
	}

	public SimpleAttachableMaterialData(int type, BlockFace direction) {
	}

	public SimpleAttachableMaterialData(Material type, BlockFace direction) {
	}

	public SimpleAttachableMaterialData(Material type) {
	}

	@Deprecated public SimpleAttachableMaterialData(int type, byte data) {
	}

	@Deprecated public SimpleAttachableMaterialData(Material type, byte data) {
	}

	public BlockFace getFacing() {
		return null;
	}

	public String toString() {
		return null;
	}

	public SimpleAttachableMaterialData clone() {
		return null;
	}
}
