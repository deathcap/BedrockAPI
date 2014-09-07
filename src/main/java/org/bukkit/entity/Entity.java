package org.bukkit.entity;

import java.util.List;
import java.util.UUID;
import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.metadata.Metadatable;
import org.bukkit.util.Vector;


public interface Entity extends Metadatable  {


	Location getLocation();

	Location getLocation(Location loc);

	void setVelocity(Vector velocity);

	Vector getVelocity();

	boolean isOnGround();

	World getWorld();

	boolean teleport(Location location);

	boolean teleport(Location location, PlayerTeleportEvent.TeleportCause cause);

	boolean teleport(Entity destination);

	boolean teleport(Entity destination, PlayerTeleportEvent.TeleportCause cause);

	List<Entity> getNearbyEntities(double x, double y, double z);

	int getEntityId();

	int getFireTicks();

	int getMaxFireTicks();

	void setFireTicks(int ticks);

	void remove();

	boolean isDead();

	boolean isValid();

	Server getServer();

	Entity getPassenger();

	boolean setPassenger(Entity passenger);

	boolean isEmpty();

	boolean eject();

	float getFallDistance();

	void setFallDistance(float distance);

	void setLastDamageCause(EntityDamageEvent event);

	EntityDamageEvent getLastDamageCause();

	UUID getUniqueId();

	int getTicksLived();

	void setTicksLived(int value);

	void playEffect(EntityEffect type);

	EntityType getType();

	boolean isInsideVehicle();

	boolean leaveVehicle();

	Entity getVehicle();
}
