package org.bukkit.entity;

import org.bukkit.Art;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Hanging;
import org.bukkit.material.Attachable;
import org.bukkit.material.Directional;
import org.bukkit.metadata.Metadatable;


public interface Painting extends Hanging  {


	Art getArt();

	boolean setArt(Art art);

	boolean setArt(Art art, boolean force);
}
