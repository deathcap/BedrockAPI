package org.bukkit;

import java.io.Serializable;
import org.bukkit.Difficulty;


public enum Difficulty  {

	PEACEFUL,
	EASY,
	NORMAL,
	HARD,
	;



	@Deprecated public int getValue() {
		return 0;
	}

	@Deprecated public static Difficulty getByValue(int value) {
		return null;
	}
}
