package org.bukkit.entity;

import org.bukkit.entity.Arrow;
import org.bukkit.entity.Egg;
import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Fish;
import org.bukkit.entity.FishHook;
import org.bukkit.entity.LargeFireball;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.SmallFireball;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.ThrownExpBottle;
import org.bukkit.entity.ThrownPotion;
import org.bukkit.entity.WitherSkull;
import org.bukkit.metadata.Metadatable;
import org.bukkit.projectiles.ProjectileSource;


public interface Projectile extends Entity  {


	@Deprecated LivingEntity _INVALID_getShooter();

	ProjectileSource getShooter();

	@Deprecated void _INVALID_setShooter(LivingEntity shooter);

	void setShooter(ProjectileSource source);

	boolean doesBounce();

	void setBounce(boolean doesBounce);
}
