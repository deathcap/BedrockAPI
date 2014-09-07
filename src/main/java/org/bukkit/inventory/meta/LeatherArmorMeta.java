package org.bukkit.inventory.meta;

import org.bukkit.Color;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;


public interface LeatherArmorMeta extends ItemMeta  {


	Color getColor();

	void setColor(Color color);

	LeatherArmorMeta clone();
}
