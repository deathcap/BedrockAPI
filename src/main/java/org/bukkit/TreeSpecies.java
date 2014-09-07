package org.bukkit;

import java.io.Serializable;
import org.bukkit.TreeSpecies;


public enum TreeSpecies  {

	GENERIC,
	REDWOOD,
	BIRCH,
	JUNGLE,
	ACACIA,
	DARK_OAK,
	;



	@Deprecated public byte getData() {
		return 0;
	}

	@Deprecated public static TreeSpecies getByData(byte data) {
		return null;
	}
}
