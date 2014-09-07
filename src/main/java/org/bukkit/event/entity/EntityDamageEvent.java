package org.bukkit.event.entity;

import java.io.Serializable;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageModifier;
import java.io.Serializable;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import java.util.Map;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntityDamageEvent.DamageModifier;
import org.bukkit.event.entity.EntityEvent;


public class EntityDamageEvent extends EntityEvent implements Cancellable  {


	@Deprecated public EntityDamageEvent(Entity damagee, EntityDamageEvent.DamageCause cause, int damage) {
	}

	@Deprecated public EntityDamageEvent(Entity damagee, EntityDamageEvent.DamageCause cause, double damage) {
	}

	public EntityDamageEvent(Entity damagee, EntityDamageEvent.DamageCause cause, Map<EntityDamageEvent.DamageModifier,Double> modifiers, Map<EntityDamageEvent.DamageModifier,? extends com.google.common.base.Function<? super Double,Double>> modifierFunctions) {
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}

	public double getOriginalDamage(EntityDamageEvent.DamageModifier type) throws IllegalArgumentException {
		return 0.0;
	}

	public void setDamage(EntityDamageEvent.DamageModifier type, double damage) throws IllegalArgumentException, UnsupportedOperationException {
	}

	public double getDamage(EntityDamageEvent.DamageModifier type) throws IllegalArgumentException {
		return 0.0;
	}

	public boolean isApplicable(EntityDamageEvent.DamageModifier type) throws IllegalArgumentException {
		return false;
	}

	public double getDamage() {
		return 0.0;
	}

	public final double getFinalDamage() {
		return 0.0;
	}

	@Deprecated public int _INVALID_getDamage() {
		return 0;
	}

	public void setDamage(double damage) {
	}

	@Deprecated public void _INVALID_setDamage(int damage) {
	}

	public EntityDamageEvent.DamageCause getCause() {
		return null;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}

	
	
	
	public static enum DamageCause  {
	
		CONTACT,
		ENTITY_ATTACK,
		PROJECTILE,
		SUFFOCATION,
		FALL,
		FIRE,
		FIRE_TICK,
		MELTING,
		LAVA,
		DROWNING,
		BLOCK_EXPLOSION,
		ENTITY_EXPLOSION,
		VOID,
		LIGHTNING,
		SUICIDE,
		STARVATION,
		POISON,
		MAGIC,
		WITHER,
		FALLING_BLOCK,
		THORNS,
		CUSTOM,
		;
	}

	
	
	
	public static enum DamageModifier  {
	
		BASE,
		HARD_HAT,
		BLOCKING,
		ARMOR,
		RESISTANCE,
		MAGIC,
		ABSORPTION,
		;
	}
}
