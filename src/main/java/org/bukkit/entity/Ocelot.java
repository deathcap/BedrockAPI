package org.bukkit.entity;

import java.io.Serializable;
import org.bukkit.entity.Ocelot;
import org.bukkit.entity.Ocelot.Type;
import org.bukkit.entity.Ageable;
import org.bukkit.entity.Animals;
import org.bukkit.entity.Creature;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Ocelot.Type;
import org.bukkit.entity.Tameable;
import org.bukkit.metadata.Metadatable;
import org.bukkit.projectiles.ProjectileSource;


public interface Ocelot extends Animals, Tameable  {


	Ocelot.Type getCatType();

	void setCatType(Ocelot.Type type);

	boolean isSitting();

	void setSitting(boolean sitting);

	
	
	
	public static enum Type  {
	
		WILD_OCELOT,
		BLACK_CAT,
		RED_CAT,
		SIAMESE_CAT,
		;
	
	
	
		@Deprecated public int getId() {
			return 0;
		}
	
		@Deprecated public static Type getType(int id) {
			return null;
		}
	}
}
