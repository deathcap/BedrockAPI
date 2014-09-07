package org.bukkit.entity;

import org.bukkit.entity.Entity;
import org.bukkit.entity.PoweredMinecart;
import org.bukkit.entity.StorageMinecart;
import org.bukkit.entity.Vehicle;
import org.bukkit.entity.minecart.CommandMinecart;
import org.bukkit.entity.minecart.ExplosiveMinecart;
import org.bukkit.entity.minecart.HopperMinecart;
import org.bukkit.entity.minecart.PoweredMinecart;
import org.bukkit.entity.minecart.RideableMinecart;
import org.bukkit.entity.minecart.SpawnerMinecart;
import org.bukkit.entity.minecart.StorageMinecart;
import org.bukkit.metadata.Metadatable;
import org.bukkit.util.Vector;


public interface Minecart extends Vehicle  {


	@Deprecated void _INVALID_setDamage(int damage);

	void setDamage(double damage);

	@Deprecated int _INVALID_getDamage();

	double getDamage();

	double getMaxSpeed();

	void setMaxSpeed(double speed);

	boolean isSlowWhenEmpty();

	void setSlowWhenEmpty(boolean slow);

	Vector getFlyingVelocityMod();

	void setFlyingVelocityMod(Vector flying);

	Vector getDerailedVelocityMod();

	void setDerailedVelocityMod(Vector derailed);
}
