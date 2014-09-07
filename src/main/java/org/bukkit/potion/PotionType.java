package org.bukkit.potion;

import java.io.Serializable;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;


public enum PotionType  {

	WATER,
	REGEN,
	SPEED,
	FIRE_RESISTANCE,
	POISON,
	INSTANT_HEAL,
	NIGHT_VISION,
	WEAKNESS,
	STRENGTH,
	SLOWNESS,
	INSTANT_DAMAGE,
	WATER_BREATHING,
	INVISIBILITY,
	;

	public PotionEffectType getEffectType() {
		return null;
	}

	@Deprecated public int getDamageValue() {
		return 0;
	}

	public int getMaxLevel() {
		return 0;
	}

	public boolean isInstant() {
		return false;
	}

	@Deprecated public static PotionType getByDamageValue(int damage) {
		return null;
	}

	public static PotionType getByEffect(PotionEffectType effectType) {
		return null;
	}
}
