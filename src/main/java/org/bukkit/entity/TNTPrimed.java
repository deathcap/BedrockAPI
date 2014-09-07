package org.bukkit.entity;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Explosive;
import org.bukkit.metadata.Metadatable;


public interface TNTPrimed extends Explosive  {


	void setFuseTicks(int fuseTicks);

	int getFuseTicks();

	Entity getSource();
}
