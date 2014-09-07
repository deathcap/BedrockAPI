package org.bukkit;

import java.io.Serializable;
import org.bukkit.Statistic;
import org.bukkit.Statistic.Type;
import java.io.Serializable;
import org.bukkit.Statistic;
import org.bukkit.Statistic.Type;


public enum Statistic  {

	DAMAGE_DEALT,
	DAMAGE_TAKEN,
	DEATHS,
	MOB_KILLS,
	PLAYER_KILLS,
	FISH_CAUGHT,
	ANIMALS_BRED,
	TREASURE_FISHED,
	JUNK_FISHED,
	LEAVE_GAME,
	JUMP,
	DROP,
	PLAY_ONE_TICK,
	WALK_ONE_CM,
	SWIM_ONE_CM,
	FALL_ONE_CM,
	CLIMB_ONE_CM,
	FLY_ONE_CM,
	DIVE_ONE_CM,
	MINECART_ONE_CM,
	BOAT_ONE_CM,
	PIG_ONE_CM,
	HORSE_ONE_CM,
	MINE_BLOCK,
	USE_ITEM,
	BREAK_ITEM,
	CRAFT_ITEM,
	KILL_ENTITY,
	ENTITY_KILLED_BY,
	;

	public Statistic.Type getType() {
		return null;
	}

	public boolean isSubstatistic() {
		return false;
	}

	public boolean isBlock() {
		return false;
	}

	
	
	
	public static enum Type  {
	
		UNTYPED,
		ITEM,
		BLOCK,
		ENTITY,
		;
	}
}
