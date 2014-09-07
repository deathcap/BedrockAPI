package org.bukkit;

import org.bukkit.World;
import org.bukkit.World.Environment;
import org.bukkit.WorldCreator;
import org.bukkit.WorldType;
import org.bukkit.command.CommandSender;
import org.bukkit.generator.ChunkGenerator;


public class WorldCreator extends Object  {


	public WorldCreator(String name) {
	}

	public WorldCreator copy(World world) {
		return null;
	}

	public WorldCreator copy(WorldCreator creator) {
		return null;
	}

	public String name() {
		return null;
	}

	public long seed() {
		return 0;
	}

	public WorldCreator seed(long seed) {
		return null;
	}

	public World.Environment environment() {
		return null;
	}

	public WorldCreator environment(World.Environment env) {
		return null;
	}

	public WorldType type() {
		return null;
	}

	public WorldCreator type(WorldType type) {
		return null;
	}

	public ChunkGenerator generator() {
		return null;
	}

	public WorldCreator generator(ChunkGenerator generator) {
		return null;
	}

	public WorldCreator generator(String generator) {
		return null;
	}

	public WorldCreator generator(String generator, CommandSender output) {
		return null;
	}

	public WorldCreator generateStructures(boolean generate) {
		return null;
	}

	public boolean generateStructures() {
		return false;
	}

	public World createWorld() {
		return null;
	}

	public static WorldCreator name(String name) {
		return null;
	}

	public static ChunkGenerator getGeneratorForName(String world, String name, CommandSender output) {
		return null;
	}
}
