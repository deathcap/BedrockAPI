package org.bukkit.inventory;

import java.util.List;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.material.MaterialData;


public class ShapelessRecipe extends Object implements Recipe  {


	public ShapelessRecipe(ItemStack result) {
	}

	public ShapelessRecipe addIngredient(MaterialData ingredient) {
		return null;
	}

	public ShapelessRecipe addIngredient(Material ingredient) {
		return null;
	}

	@Deprecated public ShapelessRecipe addIngredient(Material ingredient, int rawdata) {
		return null;
	}

	public ShapelessRecipe addIngredient(int count, MaterialData ingredient) {
		return null;
	}

	public ShapelessRecipe addIngredient(int count, Material ingredient) {
		return null;
	}

	@Deprecated public ShapelessRecipe addIngredient(int count, Material ingredient, int rawdata) {
		return null;
	}

	public ShapelessRecipe removeIngredient(Material ingredient) {
		return null;
	}

	public ShapelessRecipe removeIngredient(MaterialData ingredient) {
		return null;
	}

	public ShapelessRecipe removeIngredient(int count, Material ingredient) {
		return null;
	}

	public ShapelessRecipe removeIngredient(int count, MaterialData ingredient) {
		return null;
	}

	@Deprecated public ShapelessRecipe removeIngredient(Material ingredient, int rawdata) {
		return null;
	}

	@Deprecated public ShapelessRecipe removeIngredient(int count, Material ingredient, int rawdata) {
		return null;
	}

	public ItemStack getResult() {
		return null;
	}

	public List<ItemStack> getIngredientList() {
		return null;
	}
}
