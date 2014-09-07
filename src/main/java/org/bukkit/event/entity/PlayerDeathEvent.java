package org.bukkit.event.entity;

import java.util.List;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.inventory.ItemStack;


public class PlayerDeathEvent extends EntityDeathEvent  {


	public PlayerDeathEvent(Player player, List<ItemStack> drops, int droppedExp, String deathMessage) {
        super(player, drops);
	}

	public PlayerDeathEvent(Player player, List<ItemStack> drops, int droppedExp, int newExp, String deathMessage) {
        super(player, drops);
	}

	public PlayerDeathEvent(Player player, List<ItemStack> drops, int droppedExp, int newExp, int newTotalExp, int newLevel, String deathMessage) {
        super(player, drops);
	}

	public Player getEntity() {
		return null;
	}

	public void setDeathMessage(String deathMessage) {
	}

	public String getDeathMessage() {
		return null;
	}

	public int getNewExp() {
		return 0;
	}

	public void setNewExp(int exp) {
	}

	public int getNewLevel() {
		return 0;
	}

	public void setNewLevel(int level) {
	}

	public int getNewTotalExp() {
		return 0;
	}

	public void setNewTotalExp(int totalExp) {
	}

	public boolean getKeepLevel() {
		return false;
	}

	public void setKeepLevel(boolean keepLevel) {
	}

	public void setKeepInventory(boolean keepInventory) {
	}

	public boolean getKeepInventory() {
		return false;
	}
}
