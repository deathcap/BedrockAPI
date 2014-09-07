package org.bukkit.entity;

import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.Metadatable;


public interface Item extends Entity  {


	ItemStack getItemStack();

	void setItemStack(ItemStack stack);

	int getPickupDelay();

	void setPickupDelay(int delay);
}
