package org.bukkit.potion;

import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionEffectTypeWrapper;


public abstract class PotionEffectType extends Object  {


	public static final PotionEffectType SPEED = null;

	public static final PotionEffectType SLOW = null;

	public static final PotionEffectType FAST_DIGGING = null;

	public static final PotionEffectType SLOW_DIGGING = null;

	public static final PotionEffectType INCREASE_DAMAGE = null;

	public static final PotionEffectType HEAL = null;

	public static final PotionEffectType HARM = null;

	public static final PotionEffectType JUMP = null;

	public static final PotionEffectType CONFUSION = null;

	public static final PotionEffectType REGENERATION = null;

	public static final PotionEffectType DAMAGE_RESISTANCE = null;

	public static final PotionEffectType FIRE_RESISTANCE = null;

	public static final PotionEffectType WATER_BREATHING = null;

	public static final PotionEffectType INVISIBILITY = null;

	public static final PotionEffectType BLINDNESS = null;

	public static final PotionEffectType NIGHT_VISION = null;

	public static final PotionEffectType HUNGER = null;

	public static final PotionEffectType WEAKNESS = null;

	public static final PotionEffectType POISON = null;

	public static final PotionEffectType WITHER = null;

	public static final PotionEffectType HEALTH_BOOST = null;

	public static final PotionEffectType ABSORPTION = null;

	public static final PotionEffectType SATURATION = null;

	protected PotionEffectType(int id) {
	}

	public PotionEffect createEffect(int duration, int amplifier) {
		return null;
	}

	public abstract double getDurationModifier();

	@Deprecated public int getId() {
		return 0;
	}

	public abstract String getName();

	public abstract boolean isInstant();

	public boolean equals(Object obj) {
		return false;
	}

	public int hashCode() {
		return 0;
	}

	public String toString() {
		return null;
	}

	@Deprecated public static PotionEffectType getById(int id) {
		return null;
	}

	public static PotionEffectType getByName(String name) {
		return null;
	}

	public static void registerPotionEffectType(PotionEffectType type) {
	}

	public static void stopAcceptingRegistrations() {
	}

	public static PotionEffectType[] values() {
		return null;
	}
}
