package org.bukkit.enchantments;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.inventory.ItemStack;


public abstract class Enchantment extends Object  {


	@Deprecated public int getId() {
		return 0;
	}

	public abstract String getName();

	public abstract int getMaxLevel();

	public abstract int getStartLevel();

	public abstract EnchantmentTarget getItemTarget();

	public abstract boolean conflictsWith(Enchantment other);

	public abstract boolean canEnchantItem(ItemStack item);

	public boolean equals(Object obj) {
		return false;
	}

	public int hashCode() {
		return 0;
	}

	public String toString() {
		return null;
	}

	public static void registerEnchantment(Enchantment enchantment) {
	}

	public static boolean isAcceptingRegistrations() {
		return false;
	}

	public static void stopAcceptingRegistrations() {
	}

	@Deprecated public static Enchantment getById(int id) {
		return null;
	}

	public static Enchantment getByName(String name) {
		return null;
	}

	public static Enchantment[] values() {
		return null;
	}
}
