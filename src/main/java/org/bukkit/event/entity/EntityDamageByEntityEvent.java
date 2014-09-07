package org.bukkit.event.entity;

import java.util.Map;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntityDamageEvent.DamageModifier;
import org.bukkit.event.entity.EntityEvent;


public class EntityDamageByEntityEvent extends EntityDamageEvent  {


	public Entity getDamager() {
		return null;
	}
}
