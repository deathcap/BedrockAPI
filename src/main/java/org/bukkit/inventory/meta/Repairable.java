package org.bukkit.inventory.meta;

import org.bukkit.inventory.meta.Repairable;


public interface Repairable  {


	boolean hasRepairCost();

	int getRepairCost();

	void setRepairCost(int cost);

	Repairable clone();
}
