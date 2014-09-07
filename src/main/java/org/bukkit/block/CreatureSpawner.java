package org.bukkit.block;

import org.bukkit.block.BlockState;
import org.bukkit.entity.CreatureType;
import org.bukkit.entity.EntityType;
import org.bukkit.metadata.Metadatable;


public interface CreatureSpawner extends BlockState  {


	@Deprecated CreatureType getCreatureType();

	EntityType getSpawnedType();

	void setSpawnedType(EntityType creatureType);

	@Deprecated void setCreatureType(CreatureType creatureType);

	@Deprecated String getCreatureTypeId();

	void setCreatureTypeByName(String creatureType);

	String getCreatureTypeName();

	@Deprecated void setCreatureTypeId(String creatureType);

	int getDelay();

	void setDelay(int delay);
}
