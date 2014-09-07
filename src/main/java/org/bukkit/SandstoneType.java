package org.bukkit;

import java.io.Serializable;
import org.bukkit.SandstoneType;


public enum SandstoneType  {

	CRACKED,
	GLYPHED,
	SMOOTH,
	;

	@Deprecated public byte getData() {
		return 0;
	}

	@Deprecated public static SandstoneType getByData(byte data) {
		return null;
	}
}
