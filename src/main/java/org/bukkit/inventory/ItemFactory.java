package org.bukkit.inventory;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public interface ItemFactory  {


	ItemMeta getItemMeta(Material material);

	boolean isApplicable(ItemMeta meta, ItemStack stack) throws IllegalArgumentException;

	boolean isApplicable(ItemMeta meta, Material material) throws IllegalArgumentException;

	boolean equals(ItemMeta meta1, ItemMeta meta2) throws IllegalArgumentException;

	ItemMeta asMetaFor(ItemMeta meta, ItemStack stack) throws IllegalArgumentException;

	ItemMeta asMetaFor(ItemMeta meta, Material material) throws IllegalArgumentException;

	Color getDefaultLeatherColor();
}
