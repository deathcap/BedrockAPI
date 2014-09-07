package org.bukkit.entity;

import java.io.Serializable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;


public enum EntityType  {

	DROPPED_ITEM,
	EXPERIENCE_ORB,
	LEASH_HITCH,
	PAINTING,
	ARROW,
	SNOWBALL,
	FIREBALL,
	SMALL_FIREBALL,
	ENDER_PEARL,
	ENDER_SIGNAL,
	THROWN_EXP_BOTTLE,
	ITEM_FRAME,
	WITHER_SKULL,
	PRIMED_TNT,
	FALLING_BLOCK,
	FIREWORK,
	MINECART_COMMAND,
	BOAT,
	MINECART,
	MINECART_CHEST,
	MINECART_FURNACE,
	MINECART_TNT,
	MINECART_HOPPER,
	MINECART_MOB_SPAWNER,
	CREEPER,
	SKELETON,
	SPIDER,
	GIANT,
	ZOMBIE,
	SLIME,
	GHAST,
	PIG_ZOMBIE,
	ENDERMAN,
	CAVE_SPIDER,
	SILVERFISH,
	BLAZE,
	MAGMA_CUBE,
	ENDER_DRAGON,
	WITHER,
	BAT,
	WITCH,
	PIG,
	SHEEP,
	COW,
	CHICKEN,
	SQUID,
	WOLF,
	MUSHROOM_COW,
	SNOWMAN,
	OCELOT,
	IRON_GOLEM,
	HORSE,
	VILLAGER,
	ENDER_CRYSTAL,
	SPLASH_POTION,
	EGG,
	FISHING_HOOK,
	LIGHTNING,
	WEATHER,
	PLAYER,
	COMPLEX_PART,
	UNKNOWN,
	;



	@Deprecated public String getName() {
		return null;
	}

	public Class<? extends Entity> getEntityClass() {
		return null;
	}

	@Deprecated public short getTypeId() {
		return 0;
	}

	@Deprecated public static EntityType fromName(String name) {
		return null;
	}

	@Deprecated public static EntityType fromId(int id) {
		return null;
	}

	public boolean isSpawnable() {
		return false;
	}

	public boolean isAlive() {
		return false;
	}
}
