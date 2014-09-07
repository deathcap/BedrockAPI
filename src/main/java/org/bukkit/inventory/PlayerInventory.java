package org.bukkit.inventory;

import org.bukkit.entity.HumanEntity;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;


public interface PlayerInventory extends Inventory  {


	ItemStack[] getArmorContents();

	ItemStack getHelmet();

	ItemStack getChestplate();

	ItemStack getLeggings();

	ItemStack getBoots();

	void setArmorContents(ItemStack[] items);

	void setHelmet(ItemStack helmet);

	void setChestplate(ItemStack chestplate);

	void setLeggings(ItemStack leggings);

	void setBoots(ItemStack boots);

	ItemStack getItemInHand();

	void setItemInHand(ItemStack stack);

	int getHeldItemSlot();

	void setHeldItemSlot(int slot);

	@Deprecated int clear(int id, int data);

	HumanEntity getHolder();
}
