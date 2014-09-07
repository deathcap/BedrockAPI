package org.bukkit.event.entity;

import java.io.Serializable;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;
import org.bukkit.Location;
import org.bukkit.entity.CreatureType;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;
import org.bukkit.event.entity.EntityEvent;


public class CreatureSpawnEvent extends EntityEvent implements Cancellable  {


	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}

	public LivingEntity getEntity() {
		return null;
	}

	public Location getLocation() {
		return null;
	}

	@Deprecated public CreatureType getCreatureType() {
		return null;
	}

	public CreatureSpawnEvent.SpawnReason getSpawnReason() {
		return null;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}

	
	
	
	public static enum SpawnReason  {
	
		NATURAL,
		JOCKEY,
		CHUNK_GEN,
		SPAWNER,
		EGG,
		SPAWNER_EGG,
		LIGHTNING,
		BED,
		BUILD_SNOWMAN,
		BUILD_IRONGOLEM,
		BUILD_WITHER,
		VILLAGE_DEFENSE,
		VILLAGE_INVASION,
		BREEDING,
		SLIME_SPLIT,
		REINFORCEMENTS,
		NETHER_PORTAL,
		DISPENSE_EGG,
		INFECTION,
		CURED,
		OCELOT_BABY,
		SILVERFISH_BLOCK,
		MOUNT,
		CUSTOM,
		DEFAULT,
		;
	
	
	}
}
