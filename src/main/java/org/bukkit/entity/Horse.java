package org.bukkit.entity;

import java.io.Serializable;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Horse.Variant;
import java.io.Serializable;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Horse.Style;
import java.io.Serializable;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Horse.Color;
import org.bukkit.entity.Ageable;
import org.bukkit.entity.Animals;
import org.bukkit.entity.Creature;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Horse.Color;
import org.bukkit.entity.Horse.Style;
import org.bukkit.entity.Horse.Variant;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Tameable;
import org.bukkit.entity.Vehicle;
import org.bukkit.inventory.HorseInventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.metadata.Metadatable;
import org.bukkit.projectiles.ProjectileSource;


public interface Horse extends Animals, Vehicle, InventoryHolder, Tameable  {


	Horse.Variant getVariant();

	void setVariant(Horse.Variant variant);

	Horse.Color getColor();

	void setColor(Horse.Color color);

	Horse.Style getStyle();

	void setStyle(Horse.Style style);

	boolean isCarryingChest();

	void setCarryingChest(boolean chest);

	int getDomestication();

	void setDomestication(int level);

	int getMaxDomestication();

	void setMaxDomestication(int level);

	double getJumpStrength();

	void setJumpStrength(double strength);

	HorseInventory getInventory();

	
	
	
	public static enum Color  {
	
		WHITE,
		CREAMY,
		CHESTNUT,
		BROWN,
		BLACK,
		GRAY,
		DARK_BROWN,
		;
	
	
	}

	
	
	
	public static enum Style  {
	
		NONE,
		WHITE,
		WHITEFIELD,
		WHITE_DOTS,
		BLACK_DOTS,
		;
	
	
	}

	
	
	
	public static enum Variant  {
	
		HORSE,
		DONKEY,
		MULE,
		UNDEAD_HORSE,
		SKELETON_HORSE,
		;
	
	
	}
}
