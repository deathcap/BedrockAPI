package org.bukkit.entity;

import org.bukkit.entity.AnimalTamer;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Ocelot;
import org.bukkit.entity.Wolf;


public interface Tameable  {


	boolean isTamed();

	void setTamed(boolean tame);

	AnimalTamer getOwner();

	void setOwner(AnimalTamer tamer);
}
