package org.bukkit.entity;

import java.util.Collection;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Projectile;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.Metadatable;
import org.bukkit.potion.PotionEffect;


public interface ThrownPotion extends Projectile  {


	Collection<PotionEffect> getEffects();

	ItemStack getItem();

	void setItem(ItemStack item);
}
