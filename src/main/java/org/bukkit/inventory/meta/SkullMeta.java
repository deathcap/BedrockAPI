package org.bukkit.inventory.meta;

import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;


public interface SkullMeta extends ItemMeta  {


	String getOwner();

	boolean hasOwner();

	boolean setOwner(String owner);

	SkullMeta clone();
}
