package org.bukkit.entity;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Projectile;
import org.bukkit.metadata.Metadatable;


public interface Arrow extends Projectile  {


	int getKnockbackStrength();

	void setKnockbackStrength(int knockbackStrength);

	boolean isCritical();

	void setCritical(boolean critical);
}
