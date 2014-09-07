package org.bukkit.entity;

import org.bukkit.entity.Creature;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Monster;
import org.bukkit.entity.PigZombie;
import org.bukkit.metadata.Metadatable;
import org.bukkit.projectiles.ProjectileSource;


public interface Zombie extends Monster  {


	boolean isBaby();

	void setBaby(boolean flag);

	boolean isVillager();

	void setVillager(boolean flag);
}
