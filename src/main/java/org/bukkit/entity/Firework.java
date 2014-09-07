package org.bukkit.entity;

import org.bukkit.entity.Entity;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.metadata.Metadatable;


public interface Firework extends Entity  {


	FireworkMeta getFireworkMeta();

	void setFireworkMeta(FireworkMeta meta);

	void detonate();
}
