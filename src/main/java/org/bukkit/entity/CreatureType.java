package org.bukkit.entity;

import java.io.Serializable;
import org.bukkit.entity.CreatureType;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;


@Deprecated public enum CreatureType  {

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
	PIG,
	SHEEP,
	COW,
	CHICKEN,
	SQUID,
	WOLF,
	MUSHROOM_COW,
	SNOWMAN,
	VILLAGER,
	;



	public String getName() {
		return null;
	}

	public Class<? extends Entity> getEntityClass() {
		return null;
	}

	@Deprecated public short getTypeId() {
		return 0;
	}

	public static CreatureType fromName(String name) {
		return null;
	}

	@Deprecated public static CreatureType fromId(int id) {
		return null;
	}

	@Deprecated public EntityType toEntityType() {
		return null;
	}

	public static CreatureType fromEntityType(EntityType creatureType) {
		return null;
	}
}
