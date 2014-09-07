package org.bukkit.generator;

import org.bukkit.block.Biome;
import org.bukkit.generator.ChunkGenerator;
import java.util.List;
import java.util.Random;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator.BiomeGrid;


public abstract class ChunkGenerator extends Object  {


	public ChunkGenerator() {
	}

	@Deprecated public byte[] generate(World world, Random random, int x, int z) {
		return null;
	}

	@Deprecated public short[][] generateExtBlockSections(World world, Random random, int x, int z, ChunkGenerator.BiomeGrid biomes) {
		return null;
	}

	@Deprecated public byte[][] generateBlockSections(World world, Random random, int x, int z, ChunkGenerator.BiomeGrid biomes) {
		return null;
	}

	public boolean canSpawn(World world, int x, int z) {
		return false;
	}

	public List<BlockPopulator> getDefaultPopulators(World world) {
		return null;
	}

	public Location getFixedSpawnLocation(World world, Random random) {
		return null;
	}

	
	
	
	public static interface BiomeGrid  {
	
	
		Biome getBiome(int x, int z);
	
		void setBiome(int x, int z, Biome bio);
	}
}
