package org.bukkit.event.block;

import java.io.Serializable;
import org.bukkit.event.block.BlockIgniteEvent;
import org.bukkit.event.block.BlockIgniteEvent.IgniteCause;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.BlockEvent;
import org.bukkit.event.block.BlockIgniteEvent.IgniteCause;


public class BlockIgniteEvent extends BlockEvent implements Cancellable  {


	@Deprecated public BlockIgniteEvent(Block theBlock, BlockIgniteEvent.IgniteCause cause, Player thePlayer) {
	}

	public BlockIgniteEvent(Block theBlock, BlockIgniteEvent.IgniteCause cause, Entity ignitingEntity) {
	}

	public BlockIgniteEvent(Block theBlock, BlockIgniteEvent.IgniteCause cause, Block ignitingBlock) {
	}

	public BlockIgniteEvent(Block theBlock, BlockIgniteEvent.IgniteCause cause, Entity ignitingEntity, Block ignitingBlock) {
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}

	public BlockIgniteEvent.IgniteCause getCause() {
		return null;
	}

	public Player getPlayer() {
		return null;
	}

	public Entity getIgnitingEntity() {
		return null;
	}

	public Block getIgnitingBlock() {
		return null;
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}

	
	
	
	public static enum IgniteCause  {
	
		LAVA,
		FLINT_AND_STEEL,
		SPREAD,
		LIGHTNING,
		FIREBALL,
		ENDER_CRYSTAL,
		EXPLOSION,
		;
	}
}
