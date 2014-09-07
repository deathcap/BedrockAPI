package org.bukkit.entity;

import org.bukkit.entity.Ageable;
import org.bukkit.entity.Animals;
import org.bukkit.entity.Creature;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.material.Colorable;
import org.bukkit.metadata.Metadatable;
import org.bukkit.projectiles.ProjectileSource;


public interface Sheep extends Animals, Colorable  {


	boolean isSheared();

	void setSheared(boolean flag);
}
