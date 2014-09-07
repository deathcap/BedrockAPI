package org.bukkit.inventory.meta;

import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.MapMeta;


public interface MapMeta extends ItemMeta  {


	boolean isScaling();

	void setScaling(boolean value);

	MapMeta clone();
}
