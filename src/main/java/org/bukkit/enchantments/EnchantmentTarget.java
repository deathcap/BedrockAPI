package org.bukkit.enchantments;

import java.io.Serializable;
import org.bukkit.Material;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.inventory.ItemStack;


public enum EnchantmentTarget  {

	ALL,
	ARMOR,
	ARMOR_FEET,
	ARMOR_LEGS,
	ARMOR_TORSO,
	ARMOR_HEAD,
	WEAPON,
	TOOL,
	BOW,
	FISHING_ROD,
	;

	public boolean includes(Material item) {
        return false;
    }

	public boolean includes(ItemStack item) {
		return false;
	}
}
