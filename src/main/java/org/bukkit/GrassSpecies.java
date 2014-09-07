package org.bukkit;

import java.io.Serializable;
import org.bukkit.GrassSpecies;


public enum GrassSpecies  {

	DEAD,
	NORMAL,
	FERN_LIKE,
	;



	@Deprecated public byte getData() {
		return 0;
	}

	@Deprecated public static GrassSpecies getByData(byte data) {
		return null;
	}
}
