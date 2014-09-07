package org.bukkit.util;

import java.util.Map;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.util.BlockVector;
import org.bukkit.util.Vector;


public class BlockVector extends Vector  {


	public boolean equals(Object obj) {
		return false;
	}

	public int hashCode() {
		return 0;
	}

	public BlockVector clone() {
		return null;
	}

	public static BlockVector deserialize(Map<String,Object> args) {
		return null;
	}
}
