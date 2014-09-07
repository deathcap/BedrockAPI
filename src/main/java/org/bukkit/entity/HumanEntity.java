package org.bukkit.entity;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.AnimalTamer;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.InventoryView.Property;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.metadata.Metadatable;
import org.bukkit.permissions.Permissible;
import org.bukkit.permissions.ServerOperator;
import org.bukkit.projectiles.ProjectileSource;


public interface HumanEntity extends LivingEntity, AnimalTamer, Permissible, InventoryHolder  {


	String getName();

	PlayerInventory getInventory();

	Inventory getEnderChest();

	boolean setWindowProperty(InventoryView.Property prop, int value);

	InventoryView getOpenInventory();

	InventoryView openInventory(Inventory inventory);

	InventoryView openWorkbench(Location location, boolean force);

	InventoryView openEnchanting(Location location, boolean force);

	void openInventory(InventoryView inventory);

	void closeInventory();

	ItemStack getItemInHand();

	void setItemInHand(ItemStack item);

	ItemStack getItemOnCursor();

	void setItemOnCursor(ItemStack item);

	boolean isSleeping();

	int getSleepTicks();

	GameMode getGameMode();

	void setGameMode(GameMode mode);

	boolean isBlocking();

	int getExpToLevel();
}
