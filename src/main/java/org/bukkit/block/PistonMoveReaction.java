package org.bukkit.block;

import java.io.Serializable;
import org.bukkit.block.PistonMoveReaction;


public enum PistonMoveReaction  {

	MOVE,
	BREAK,
	BLOCK,
	;



	@Deprecated public int getId() {
		return 0;
	}

	@Deprecated public static PistonMoveReaction getById(int id) {
		return null;
	}
}
