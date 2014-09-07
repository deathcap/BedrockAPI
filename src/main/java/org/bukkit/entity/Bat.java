package org.bukkit.entity;

import org.bukkit.entity.Ambient;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.metadata.Metadatable;
import org.bukkit.projectiles.ProjectileSource;


public interface Bat extends Ambient  {


	boolean isAwake();

	void setAwake(boolean state);
}
