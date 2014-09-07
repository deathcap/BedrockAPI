package org.bukkit;

import java.io.Serializable;
import org.bukkit.Effect;
import org.bukkit.Effect.Type;
import java.io.Serializable;
import org.bukkit.Effect;
import org.bukkit.Effect.Type;


public enum Effect  {

	CLICK2,
	CLICK1,
	BOW_FIRE,
	DOOR_TOGGLE,
	EXTINGUISH,
	RECORD_PLAY,
	GHAST_SHRIEK,
	GHAST_SHOOT,
	BLAZE_SHOOT,
	ZOMBIE_CHEW_WOODEN_DOOR,
	ZOMBIE_CHEW_IRON_DOOR,
	ZOMBIE_DESTROY_DOOR,
	SMOKE,
	STEP_SOUND,
	POTION_BREAK,
	ENDER_SIGNAL,
	MOBSPAWNER_FLAMES,
	;

	@Deprecated public int getId() {
		return 0;
	}

	public Effect.Type getType() {
		return null;
	}

	public Class<?> getData() {
		return null;
	}

	@Deprecated public static Effect getById(int id) {
		return null;
	}

	
	
	
	public static enum Type  {
	
		SOUND,
		VISUAL,
		;
	}
}
