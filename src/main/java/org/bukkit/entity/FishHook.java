package org.bukkit.entity;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Fish;
import org.bukkit.entity.Projectile;
import org.bukkit.metadata.Metadatable;


public interface FishHook extends Projectile  {


	double getBiteChance();

	void setBiteChance(double chance) throws IllegalArgumentException;
}
