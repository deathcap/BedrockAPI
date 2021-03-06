package org.bukkit.event.entity;

import java.util.Map;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntityDamageEvent.DamageModifier;
import org.bukkit.event.entity.EntityEvent;


public class EntityDamageByBlockEvent extends EntityDamageEvent  {


	@Deprecated public EntityDamageByBlockEvent(Block damager, Entity damagee, EntityDamageEvent.DamageCause cause, int damage) {
	}

	@Deprecated public EntityDamageByBlockEvent(Block damager, Entity damagee, EntityDamageEvent.DamageCause cause, double damage) {
	}

	public EntityDamageByBlockEvent(Block damager, Entity damagee, EntityDamageEvent.DamageCause cause, Map<EntityDamageEvent.DamageModifier,Double> modifiers, Map<EntityDamageEvent.DamageModifier,? extends com.google.common.base.Function<? super Double,Double>> modifierFunctions) {
	}

	public Block getDamager() {
		return null;
	}
}
