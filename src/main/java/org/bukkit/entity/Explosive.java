package org.bukkit.entity;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.LargeFireball;
import org.bukkit.entity.SmallFireball;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.entity.WitherSkull;
import org.bukkit.metadata.Metadatable;


public interface Explosive extends Entity  {


	void setYield(float yield);

	float getYield();

	void setIsIncendiary(boolean isIncendiary);

	boolean isIncendiary();
}
