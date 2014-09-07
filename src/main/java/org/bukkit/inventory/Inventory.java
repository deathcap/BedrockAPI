package org.bukkit.inventory;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.BeaconInventory;
import org.bukkit.inventory.BrewerInventory;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.DoubleChestInventory;
import org.bukkit.inventory.EnchantingInventory;
import org.bukkit.inventory.FurnaceInventory;
import org.bukkit.inventory.HorseInventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MerchantInventory;
import org.bukkit.inventory.PlayerInventory;


public interface Inventory extends Iterable<ItemStack>  {


	int getSize();

	int getMaxStackSize();

	void setMaxStackSize(int size);

	String getName();

	ItemStack getItem(int index);

	void setItem(int index, ItemStack item);

	HashMap<Integer,ItemStack> addItem(ItemStack... items) throws IllegalArgumentException;

	HashMap<Integer,ItemStack> removeItem(ItemStack... items) throws IllegalArgumentException;

	ItemStack[] getContents();

	void setContents(ItemStack[] items) throws IllegalArgumentException;

	@Deprecated boolean contains(int materialId);

	boolean contains(Material material) throws IllegalArgumentException;

	boolean contains(ItemStack item);

	@Deprecated boolean contains(int materialId, int amount);

	boolean contains(Material material, int amount) throws IllegalArgumentException;

	boolean contains(ItemStack item, int amount);

	boolean containsAtLeast(ItemStack item, int amount);

	@Deprecated HashMap<Integer,? extends ItemStack> all(int materialId);

	HashMap<Integer,? extends ItemStack> all(Material material) throws IllegalArgumentException;

	HashMap<Integer,? extends ItemStack> all(ItemStack item);

	@Deprecated int first(int materialId);

	int first(Material material) throws IllegalArgumentException;

	int first(ItemStack item);

	int firstEmpty();

	@Deprecated void remove(int materialId);

	void remove(Material material) throws IllegalArgumentException;

	void remove(ItemStack item);

	void clear(int index);

	void clear();

	List<HumanEntity> getViewers();

	String getTitle();

	InventoryType getType();

	InventoryHolder getHolder();

	ListIterator<ItemStack> iterator();

	ListIterator<ItemStack> iterator(int index);
}
