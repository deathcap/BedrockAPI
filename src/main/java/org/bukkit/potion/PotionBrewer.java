package org.bukkit.potion;

import java.util.Collection;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public interface PotionBrewer  {


	PotionEffect createEffect(PotionEffectType potion, int duration, int amplifier);

	@Deprecated Collection<PotionEffect> getEffectsFromDamage(int damage);
}
