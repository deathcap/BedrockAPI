package org.bukkit.potion;

import org.bukkit.potion.PotionEffectType;


public class PotionEffectTypeWrapper extends PotionEffectType  {


	public double getDurationModifier() {
		return 0.0;
	}

	public String getName() {
		return null;
	}

	public PotionEffectType getType() {
		return null;
	}

	public boolean isInstant() {
		return false;
	}
}
