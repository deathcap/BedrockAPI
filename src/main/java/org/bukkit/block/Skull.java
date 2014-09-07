package org.bukkit.block;

import org.bukkit.SkullType;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.metadata.Metadatable;


public interface Skull extends BlockState  {


	boolean hasOwner();

	String getOwner();

	boolean setOwner(String name);

	BlockFace getRotation();

	void setRotation(BlockFace rotation);

	SkullType getSkullType();

	void setSkullType(SkullType skullType);
}
