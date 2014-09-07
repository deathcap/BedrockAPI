package org.bukkit.potion;

import java.util.Map;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.entity.LivingEntity;
import org.bukkit.potion.PotionEffectType;


public class PotionEffect extends Object implements ConfigurationSerializable  {


	public PotionEffect(PotionEffectType type, int duration, int amplifier, boolean ambient) {
	}

	public PotionEffect(PotionEffectType type, int duration, int amplifier) {
	}

	public PotionEffect(Map<String,Object> map) {
	}

	public Map<String,Object> serialize() {
		return null;
	}

	public boolean apply(LivingEntity entity) {
		return false;
	}

	public boolean equals(Object obj) {
		return false;
	}

	public int getAmplifier() {
		return 0;
	}

	public int getDuration() {
		return 0;
	}

	public PotionEffectType getType() {
		return null;
	}

	public boolean isAmbient() {
		return false;
	}

	public int hashCode() {
		return 0;
	}

	public String toString() {
		return null;
	}
}
