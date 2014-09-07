package org.bukkit.block;

import org.bukkit.block.BlockState;
import org.bukkit.metadata.Metadatable;


public interface CommandBlock extends BlockState  {


	String getCommand();

	void setCommand(String command);

	String getName();

	void setName(String name);
}
