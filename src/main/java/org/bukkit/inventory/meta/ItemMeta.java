package org.bukkit.inventory.meta;

import java.util.List;
import java.util.Map;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.bukkit.inventory.meta.FireworkEffectMeta;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.MapMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.inventory.meta.SkullMeta;


public interface ItemMeta extends Cloneable, ConfigurationSerializable  {


	boolean hasDisplayName();

	String getDisplayName();

	void setDisplayName(String name);

	boolean hasLore();

	List<String> getLore();

	void setLore(List<String> lore);

	boolean hasEnchants();

	boolean hasEnchant(Enchantment ench);

	int getEnchantLevel(Enchantment ench);

	Map<Enchantment,Integer> getEnchants();

	boolean addEnchant(Enchantment ench, int level, boolean ignoreLevelRestriction);

	boolean removeEnchant(Enchantment ench);

	boolean hasConflictingEnchant(Enchantment ench);

	ItemMeta clone();
}
