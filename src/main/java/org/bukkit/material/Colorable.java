package org.bukkit.material;

import org.bukkit.DyeColor;
import org.bukkit.entity.Sheep;
import org.bukkit.material.Dye;
import org.bukkit.material.Wool;


public interface Colorable  {


	DyeColor getColor();

	void setColor(DyeColor color);
}
