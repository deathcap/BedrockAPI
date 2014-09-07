package org.bukkit;

import java.io.Serializable;
import org.bukkit.Achievement;


public enum Achievement  {

	OPEN_INVENTORY,
	MINE_WOOD,
	BUILD_WORKBENCH,
	BUILD_PICKAXE,
	BUILD_FURNACE,
	ACQUIRE_IRON,
	BUILD_HOE,
	MAKE_BREAD,
	BAKE_CAKE,
	BUILD_BETTER_PICKAXE,
	COOK_FISH,
	ON_A_RAIL,
	BUILD_SWORD,
	KILL_ENEMY,
	KILL_COW,
	FLY_PIG,
	SNIPE_SKELETON,
	GET_DIAMONDS,
	NETHER_PORTAL,
	GHAST_RETURN,
	GET_BLAZE_ROD,
	BREW_POTION,
	END_PORTAL,
	THE_END,
	ENCHANTMENTS,
	OVERKILL,
	BOOKCASE,
	EXPLORE_ALL_BIOMES,
	SPAWN_WITHER,
	KILL_WITHER,
	FULL_BEACON,
	BREED_COW,
	DIAMONDS_TO_YOU,
	;

	public boolean hasParent() {
		return false;
	}

	public Achievement getParent() {
		return null;
	}
}
