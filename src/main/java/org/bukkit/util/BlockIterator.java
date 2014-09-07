package org.bukkit.util;

import java.util.Iterator;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.LivingEntity;
import org.bukkit.util.Vector;


public class BlockIterator extends Object implements Iterator<Block>  {


	public BlockIterator(World world, Vector start, Vector direction, double yOffset, int maxDistance) {
	}

	public BlockIterator(Location loc, double yOffset, int maxDistance) {
	}

	public BlockIterator(Location loc, double yOffset) {
	}

	public BlockIterator(Location loc) {
	}

	public BlockIterator(LivingEntity entity, int maxDistance) {
	}

	public BlockIterator(LivingEntity entity) {
	}

	public boolean hasNext() {
		return false;
	}

	public Block next() {
		return null;
	}

	public void remove() {
	}
}
