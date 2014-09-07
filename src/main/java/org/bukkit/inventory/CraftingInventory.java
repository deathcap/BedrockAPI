package org.bukkit.inventory;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;


public interface CraftingInventory extends Inventory  {


	ItemStack getResult();

	ItemStack[] getMatrix();

	void setResult(ItemStack newResult);

	void setMatrix(ItemStack[] contents);

	Recipe getRecipe();
}
