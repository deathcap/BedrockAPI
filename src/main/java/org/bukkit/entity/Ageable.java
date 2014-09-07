package org.bukkit.entity;

import org.bukkit.entity.Animals;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Creature;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Horse;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.MushroomCow;
import org.bukkit.entity.Ocelot;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Wolf;
import org.bukkit.metadata.Metadatable;
import org.bukkit.projectiles.ProjectileSource;


public interface Ageable extends Creature  {


	int getAge();

	void setAge(int age);

	void setAgeLock(boolean lock);

	boolean getAgeLock();

	void setBaby();

	void setAdult();

	boolean isAdult();

	boolean canBreed();

	void setBreed(boolean breed);
}
