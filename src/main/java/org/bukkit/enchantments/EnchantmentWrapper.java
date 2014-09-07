package org.bukkit.enchantments;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.inventory.ItemStack;


public class EnchantmentWrapper extends Enchantment  {


	public EnchantmentWrapper(int id) {
	}

	public Enchantment getEnchantment() {
		return null;
	}

	public int getMaxLevel() {
		return 0;
	}

	public int getStartLevel() {
		return 0;
	}

	public EnchantmentTarget getItemTarget() {
		return null;
	}

	public boolean canEnchantItem(ItemStack item) {
		return false;
	}

	public String getName() {
		return null;
	}

	public boolean conflictsWith(Enchantment other) {
		return false;
	}
}
