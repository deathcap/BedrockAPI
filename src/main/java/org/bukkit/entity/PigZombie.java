package org.bukkit.entity;

import org.bukkit.entity.Creature;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Zombie;
import org.bukkit.metadata.Metadatable;
import org.bukkit.projectiles.ProjectileSource;


public interface PigZombie extends Zombie  {


	int getAnger();

	void setAnger(int level);

	void setAngry(boolean angry);

	boolean isAngry();
}
