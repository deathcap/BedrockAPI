package org.bukkit.entity;

import org.bukkit.DyeColor;
import org.bukkit.entity.Ageable;
import org.bukkit.entity.Animals;
import org.bukkit.entity.Creature;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Tameable;
import org.bukkit.metadata.Metadatable;
import org.bukkit.projectiles.ProjectileSource;


public interface Wolf extends Animals, Tameable  {


	boolean isAngry();

	void setAngry(boolean angry);

	boolean isSitting();

	void setSitting(boolean sitting);

	DyeColor getCollarColor();

	void setCollarColor(DyeColor color);
}
