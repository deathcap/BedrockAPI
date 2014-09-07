package org.bukkit.block;

import org.bukkit.Material;
import org.bukkit.block.BlockState;
import org.bukkit.metadata.Metadatable;


public interface Jukebox extends BlockState  {


	Material getPlaying();

	void setPlaying(Material record);

	boolean isPlaying();

	boolean eject();
}
