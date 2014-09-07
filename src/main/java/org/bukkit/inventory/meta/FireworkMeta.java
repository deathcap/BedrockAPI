package org.bukkit.inventory.meta;

import java.util.List;
import org.bukkit.FireworkEffect;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.inventory.meta.ItemMeta;


public interface FireworkMeta extends ItemMeta  {


	void addEffect(FireworkEffect effect) throws IllegalArgumentException;

	void addEffects(FireworkEffect... effects) throws IllegalArgumentException;

	void addEffects(Iterable<FireworkEffect> effects) throws IllegalArgumentException;

	List<FireworkEffect> getEffects();

	int getEffectsSize();

	void removeEffect(int index) throws IndexOutOfBoundsException;

	void clearEffects();

	boolean hasEffects();

	int getPower();

	void setPower(int power) throws IllegalArgumentException;

	FireworkMeta clone();
}
