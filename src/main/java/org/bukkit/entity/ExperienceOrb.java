package org.bukkit.entity;

import org.bukkit.entity.Entity;
import org.bukkit.metadata.Metadatable;


public interface ExperienceOrb extends Entity  {


	int getExperience();

	void setExperience(int value);
}
