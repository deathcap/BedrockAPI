package org.bukkit.entity;

import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.LeashHitch;
import org.bukkit.entity.Painting;
import org.bukkit.material.Attachable;
import org.bukkit.material.Directional;
import org.bukkit.metadata.Metadatable;


public interface Hanging extends Entity, Attachable  {


	boolean setFacingDirection(BlockFace face, boolean force);
}
