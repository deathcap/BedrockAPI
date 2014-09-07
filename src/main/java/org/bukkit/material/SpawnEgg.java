package org.bukkit.material;

import org.bukkit.entity.EntityType;
import org.bukkit.material.MaterialData;
import org.bukkit.material.SpawnEgg;


public class SpawnEgg extends MaterialData  {


	public SpawnEgg() {
	}

	@Deprecated public SpawnEgg(int type, byte data) {
	}

	@Deprecated public SpawnEgg(byte data) {
	}

	public SpawnEgg(EntityType type) {
	}

	public EntityType getSpawnedType() {
		return null;
	}

	public void setSpawnedType(EntityType type) {
	}

	public String toString() {
		return null;
	}

	public SpawnEgg clone() {
		return null;
	}
}
