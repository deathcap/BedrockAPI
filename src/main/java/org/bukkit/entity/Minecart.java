package org.bukkit.entity;

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
