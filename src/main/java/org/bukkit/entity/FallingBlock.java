package org.bukkit.entity;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.FallingSand;
import org.bukkit.metadata.Metadatable;


public interface FallingBlock extends Entity  {


	Material getMaterial();

	@Deprecated int getBlockId();

	@Deprecated byte getBlockData();

	boolean getDropItem();

	void setDropItem(boolean drop);
}
