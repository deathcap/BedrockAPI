package org.bukkit.event.entity;

import java.util.List;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;


public class EntityDeathEvent extends EntityEvent  {


	public EntityDeathEvent(LivingEntity entity, List<ItemStack> drops) {
	}

	public EntityDeathEvent(LivingEntity what, List<ItemStack> drops, int droppedExp) {
	}

	public LivingEntity getEntity() {
		return null;
	}

	public int getDroppedExp() {
		return 0;
	}

	public void setDroppedExp(int exp) {
	}

	public List<ItemStack> getDrops() {
		return null;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
