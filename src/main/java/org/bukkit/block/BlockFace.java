package org.bukkit.block;

import java.io.Serializable;
import org.bukkit.block.BlockFace;


public enum BlockFace  {

	NORTH,
	EAST,
	SOUTH,
	WEST,
	UP,
	DOWN,
	NORTH_EAST,
	NORTH_WEST,
	SOUTH_EAST,
	SOUTH_WEST,
	WEST_NORTH_WEST,
	NORTH_NORTH_WEST,
	NORTH_NORTH_EAST,
	EAST_NORTH_EAST,
	EAST_SOUTH_EAST,
	SOUTH_SOUTH_EAST,
	SOUTH_SOUTH_WEST,
	WEST_SOUTH_WEST,
	SELF,
	;



	public int getModX() {
		return 0;
	}

	public int getModY() {
		return 0;
	}

	public int getModZ() {
		return 0;
	}

	public BlockFace getOppositeFace() {
		return null;
	}
}
