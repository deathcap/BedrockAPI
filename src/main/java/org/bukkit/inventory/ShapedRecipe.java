package org.bukkit.inventory;

import java.util.Map;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.material.MaterialData;


public class ShapedRecipe extends Object implements Recipe  {


	public ShapedRecipe shape(String... shape) {
		return null;
	}

	public ShapedRecipe setIngredient(char key, MaterialData ingredient) {
		return null;
	}

	public ShapedRecipe setIngredient(char key, Material ingredient) {
		return null;
	}

	@Deprecated public ShapedRecipe setIngredient(char key, Material ingredient, int raw) {
		return null;
	}

	public Map<Character,ItemStack> getIngredientMap() {
		return null;
	}

	public String[] getShape() {
		return null;
	}

	public ItemStack getResult() {
		return null;
	}
}
