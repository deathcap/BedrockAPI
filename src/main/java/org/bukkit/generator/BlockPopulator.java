package org.bukkit.generator;

import java.util.Random;
import org.bukkit.Chunk;
import org.bukkit.World;


public abstract class BlockPopulator extends Object  {


	public BlockPopulator() {
	}

	public abstract void populate(World world, Random random, Chunk source);
}
