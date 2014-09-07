package org.bukkit;

import java.io.Serializable;
import org.bukkit.CropState;


public enum CropState  {

	SEEDED,
	GERMINATED,
	VERY_SMALL,
	SMALL,
	MEDIUM,
	TALL,
	VERY_TALL,
	RIPE,
	;

	@Deprecated public byte getData() {
		return 0;
	}

	@Deprecated public static CropState getByData(byte data) {
		return null;
	}
}
