package org.bukkit.event.enchantment;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.inventory.InventoryEvent;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;


public class PrepareItemEnchantEvent extends InventoryEvent implements Cancellable  {


	public Player getEnchanter() {
		return null;
	}

	public Block getEnchantBlock() {
		return null;
	}

	public ItemStack getItem() {
		return null;
	}

	public int[] getExpLevelCostsOffered() {
		return null;
	}

	public int getEnchantmentBonus() {
		return 0;
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
