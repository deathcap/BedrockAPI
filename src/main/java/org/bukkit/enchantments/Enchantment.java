package org.bukkit.enchantments;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.inventory.ItemStack;


public abstract class Enchantment extends Object  {


	public static final Enchantment PROTECTION_ENVIRONMENTAL = null;

	public static final Enchantment PROTECTION_FIRE = null;

	public static final Enchantment PROTECTION_FALL = null;

	public static final Enchantment PROTECTION_EXPLOSIONS = null;

	public static final Enchantment PROTECTION_PROJECTILE = null;

	public static final Enchantment OXYGEN = null;

	public static final Enchantment WATER_WORKER = null;

	public static final Enchantment THORNS = null;

	public static final Enchantment DAMAGE_ALL = null;

	public static final Enchantment DAMAGE_UNDEAD = null;

	public static final Enchantment DAMAGE_ARTHROPODS = null;

	public static final Enchantment KNOCKBACK = null;

	public static final Enchantment FIRE_ASPECT = null;

	public static final Enchantment LOOT_BONUS_MOBS = null;

	public static final Enchantment DIG_SPEED = null;

	public static final Enchantment SILK_TOUCH = null;

	public static final Enchantment DURABILITY = null;

	public static final Enchantment LOOT_BONUS_BLOCKS = null;

	public static final Enchantment ARROW_DAMAGE = null;

	public static final Enchantment ARROW_KNOCKBACK = null;

	public static final Enchantment ARROW_FIRE = null;

	public static final Enchantment ARROW_INFINITE = null;

	public static final Enchantment LUCK = null;

	public static final Enchantment LURE = null;

	public Enchantment(int id) {
	}

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
