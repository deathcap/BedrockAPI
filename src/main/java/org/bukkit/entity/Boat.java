package org.bukkit.entity;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Vehicle;
import org.bukkit.metadata.Metadatable;


public interface Boat extends Vehicle  {


	double getMaxSpeed();

	void setMaxSpeed(double speed);

	double getOccupiedDeceleration();

	void setOccupiedDeceleration(double rate);

	double getUnoccupiedDeceleration();

	void setUnoccupiedDeceleration(double rate);

	boolean getWorkOnLand();

	void setWorkOnLand(boolean workOnLand);
}
