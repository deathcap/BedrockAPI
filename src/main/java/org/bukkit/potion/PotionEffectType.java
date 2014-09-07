package org.bukkit.potion;

import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionEffectTypeWrapper;


public abstract class PotionEffectType extends Object  {


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
