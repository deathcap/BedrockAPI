package org.bukkit;

import java.io.Serializable;
import org.bukkit.Instrument;


public enum Instrument  {

	PIANO,
	BASS_DRUM,
	SNARE_DRUM,
	STICKS,
	BASS_GUITAR,
	;

	@Deprecated public byte getType() {
		return 0;
	}

	@Deprecated public static Instrument getByType(byte type) {
		return null;
	}
}
