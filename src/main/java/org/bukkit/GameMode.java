package org.bukkit;

import java.io.Serializable;
import org.bukkit.GameMode;


public enum GameMode  {

	CREATIVE,
	SURVIVAL,
	ADVENTURE,
	;

	@Deprecated public int getValue() {
		return 0;
	}

	@Deprecated public static GameMode getByValue(int value) {
		return null;
	}
}
