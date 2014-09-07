package org.bukkit.event.enchantment;

import java.util.Map;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.inventory.InventoryEvent;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;


public class EnchantItemEvent extends InventoryEvent implements Cancellable  {


	public EnchantItemEvent(Player enchanter, InventoryView view, Block table, ItemStack item, int level, Map<Enchantment,Integer> enchants, int i) {
	}

	public Player getEnchanter() {
		return null;
	}

	public Block getEnchantBlock() {
		return null;
	}

	public ItemStack getItem() {
		return null;
	}

	public int getExpLevelCost() {
		return 0;
	}

	public void setExpLevelCost(int level) {
	}

	public Map<Enchantment,Integer> getEnchantsToAdd() {
		return null;
	}

	public int whichButton() {
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
