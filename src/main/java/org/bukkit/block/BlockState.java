package org.bukkit.block;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Beacon;
import org.bukkit.block.Block;
import org.bukkit.block.BrewingStand;
import org.bukkit.block.Chest;
import org.bukkit.block.CommandBlock;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.block.Dispenser;
import org.bukkit.block.Dropper;
import org.bukkit.block.Furnace;
import org.bukkit.block.Hopper;
import org.bukkit.block.Jukebox;
import org.bukkit.block.NoteBlock;
import org.bukkit.block.Sign;
import org.bukkit.block.Skull;
import org.bukkit.material.MaterialData;
import org.bukkit.metadata.Metadatable;


public interface BlockState extends Metadatable  {


	Block getBlock();

	MaterialData getData();

	Material getType();

	@Deprecated int getTypeId();

	byte getLightLevel();

	World getWorld();

	int getX();

	int getY();

	int getZ();

	Location getLocation();

	Location getLocation(Location loc);

	Chunk getChunk();

	void setData(MaterialData data);

	void setType(Material type);

	@Deprecated boolean setTypeId(int type);

	boolean update();

	boolean update(boolean force);

	boolean update(boolean force, boolean applyPhysics);

	@Deprecated byte getRawData();

	@Deprecated void setRawData(byte data);
}
