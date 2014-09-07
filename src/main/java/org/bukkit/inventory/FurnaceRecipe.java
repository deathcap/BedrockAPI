package org.bukkit.inventory;

import org.bukkit.Material;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.material.MaterialData;


public class FurnaceRecipe extends Object implements Recipe  {


	public FurnaceRecipe(ItemStack result, Material source) {
	}

	public FurnaceRecipe(ItemStack result, MaterialData source) {
	}

	@Deprecated public FurnaceRecipe(ItemStack result, Material source, int data) {
	}

	public FurnaceRecipe setInput(MaterialData input) {
		return null;
	}

	public FurnaceRecipe setInput(Material input) {
		return null;
	}

	@Deprecated public FurnaceRecipe setInput(Material input, int data) {
		return null;
	}

	public ItemStack getInput() {
		return null;
	}

	public ItemStack getResult() {
		return null;
	}
}
