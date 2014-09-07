package org.bukkit.entity;

import org.bukkit.Rotation;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Hanging;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.Attachable;
import org.bukkit.material.Directional;
import org.bukkit.metadata.Metadatable;


public interface ItemFrame extends Hanging  {


	ItemStack getItem();

	void setItem(ItemStack item);

	Rotation getRotation();

	void setRotation(Rotation rotation) throws IllegalArgumentException;
}
