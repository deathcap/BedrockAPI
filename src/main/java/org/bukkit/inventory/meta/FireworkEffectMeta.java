package org.bukkit.inventory.meta;

import org.bukkit.FireworkEffect;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.inventory.meta.FireworkEffectMeta;
import org.bukkit.inventory.meta.ItemMeta;


public interface FireworkEffectMeta extends ItemMeta  {


	void setEffect(FireworkEffect effect);

	boolean hasEffect();

	FireworkEffect getEffect();

	FireworkEffectMeta clone();
}
