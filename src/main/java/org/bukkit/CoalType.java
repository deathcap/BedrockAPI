package org.bukkit;

import java.io.Serializable;
import org.bukkit.CoalType;


public enum CoalType  {

	COAL,
	CHARCOAL,
	;



	@Deprecated public byte getData() {
		return 0;
	}

	@Deprecated public static CoalType getByData(byte data) {
		return null;
	}
}
