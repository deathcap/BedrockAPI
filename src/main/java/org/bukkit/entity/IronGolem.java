package org.bukkit.entity;

import org.bukkit.entity.Creature;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Golem;
import org.bukkit.entity.LivingEntity;
import org.bukkit.metadata.Metadatable;
import org.bukkit.projectiles.ProjectileSource;


public interface IronGolem extends Golem  {


	boolean isPlayerCreated();

	void setPlayerCreated(boolean playerCreated);
}
