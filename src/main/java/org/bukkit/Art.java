package org.bukkit;

import java.io.Serializable;
import org.bukkit.Art;


public enum Art  {

	KEBAB,
	AZTEC,
	ALBAN,
	AZTEC2,
	BOMB,
	PLANT,
	WASTELAND,
	POOL,
	COURBET,
	SEA,
	SUNSET,
	CREEBET,
	WANDERER,
	GRAHAM,
	MATCH,
	BUST,
	STAGE,
	VOID,
	SKULL_AND_ROSES,
	WITHER,
	FIGHTERS,
	POINTER,
	PIGSCENE,
	BURNINGSKULL,
	SKELETON,
	DONKEYKONG,
	;



	public int getBlockWidth() {
		return 0;
	}

	public int getBlockHeight() {
		return 0;
	}

	@Deprecated public int getId() {
		return 0;
	}

	@Deprecated public static Art getById(int id) {
		return null;
	}

	public static Art getByName(String name) {
		return null;
	}
}
