package org.bukkit.entity;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Explosive;
import org.bukkit.entity.LargeFireball;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.SmallFireball;
import org.bukkit.entity.WitherSkull;
import org.bukkit.metadata.Metadatable;
import org.bukkit.util.Vector;


public interface Fireball extends Projectile, Explosive  {


	void setDirection(Vector direction);

	Vector getDirection();
}
