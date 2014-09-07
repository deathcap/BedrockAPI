package org.bukkit.inventory;

import java.util.Map;
import org.bukkit.Material;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;


public class ItemStack extends Object implements Cloneable, ConfigurationSerializable  {


	protected ItemStack() {
	}

	@Deprecated public ItemStack(int type) {
	}

	public ItemStack(Material type) {
	}

	@Deprecated public ItemStack(int type, int amount) {
	}

	public ItemStack(Material type, int amount) {
	}

	@Deprecated public ItemStack(int type, int amount, short damage) {
	}

	public ItemStack(Material type, int amount, short damage) {
	}

	@Deprecated public ItemStack(int type, int amount, short damage, Byte data) {
	}

	@Deprecated public ItemStack(Material type, int amount, short damage, Byte data) {
	}

	public ItemStack(ItemStack stack) throws IllegalArgumentException {
	}

	public Material getType() {
		return null;
	}

	public void setType(Material type) {
	}

	@Deprecated public int getTypeId() {
		return 0;
	}

	@Deprecated public void setTypeId(int type) {
	}

	public int getAmount() {
		return 0;
	}

	public void setAmount(int amount) {
	}

	public MaterialData getData() {
		return null;
	}

	public void setData(MaterialData data) {
	}

	public void setDurability(short durability) {
	}

	public short getDurability() {
		return 0;
	}

	public int getMaxStackSize() {
		return 0;
	}

	public String toString() {
		return null;
	}

	public boolean equals(Object obj) {
		return false;
	}

	public boolean isSimilar(ItemStack stack) {
		return false;
	}

	public ItemStack clone() {
		return null;
	}

	public final int hashCode() {
		return 0;
	}

	public boolean containsEnchantment(Enchantment ench) {
		return false;
	}

	public int getEnchantmentLevel(Enchantment ench) {
		return 0;
	}

	public Map<Enchantment,Integer> getEnchantments() {
		return null;
	}

	public void addEnchantments(Map<Enchantment,Integer> enchantments) {
	}

	public void addEnchantment(Enchantment ench, int level) {
	}

	public void addUnsafeEnchantments(Map<Enchantment,Integer> enchantments) {
	}

	public void addUnsafeEnchantment(Enchantment ench, int level) {
	}

	public int removeEnchantment(Enchantment ench) {
		return 0;
	}

	public Map<String,Object> serialize() {
		return null;
	}

	public static ItemStack deserialize(Map<String,Object> args) {
		return null;
	}

	public ItemMeta getItemMeta() {
		return null;
	}

	public boolean hasItemMeta() {
		return false;
	}

	public boolean setItemMeta(ItemMeta itemMeta) {
		return false;
	}
}
