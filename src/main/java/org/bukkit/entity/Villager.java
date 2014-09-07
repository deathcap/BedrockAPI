package org.bukkit.entity;

import java.io.Serializable;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Villager.Profession;
import org.bukkit.entity.Ageable;
import org.bukkit.entity.Creature;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.NPC;
import org.bukkit.entity.Villager.Profession;
import org.bukkit.metadata.Metadatable;
import org.bukkit.projectiles.ProjectileSource;


public interface Villager extends Ageable, NPC  {


	Villager.Profession getProfession();

	void setProfession(Villager.Profession profession);

	
	
	
	public static enum Profession  {
	
		FARMER,
		LIBRARIAN,
		PRIEST,
		BLACKSMITH,
		BUTCHER,
		;
	
	
	
		@Deprecated public int getId() {
			return 0;
		}
	
		@Deprecated public static Profession getProfession(int id) {
			return null;
		}
	}
}
