package org.bukkit;

import java.io.Serializable;
import org.bukkit.EntityEffect;


public enum EntityEffect  {

	HURT,
	DEATH,
	WOLF_SMOKE,
	WOLF_HEARTS,
	WOLF_SHAKE,
	SHEEP_EAT,
	IRON_GOLEM_ROSE,
	VILLAGER_HEART,
	VILLAGER_ANGRY,
	VILLAGER_HAPPY,
	WITCH_MAGIC,
	ZOMBIE_TRANSFORM,
	FIREWORK_EXPLODE,
	;

	@Deprecated public byte getData() {
		return 0;
	}

	@Deprecated public static EntityEffect getByData(byte data) {
		return null;
	}
}
