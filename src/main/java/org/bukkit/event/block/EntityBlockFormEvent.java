package org.bukkit.event.block;

import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.block.BlockEvent;
import org.bukkit.event.block.BlockFormEvent;
import org.bukkit.event.block.BlockGrowEvent;


public class EntityBlockFormEvent extends BlockFormEvent  {


	public EntityBlockFormEvent(Entity entity, Block block, BlockState blockstate) {
        super(block, blockstate);
	}

	public Entity getEntity() {
		return null;
	}
}
