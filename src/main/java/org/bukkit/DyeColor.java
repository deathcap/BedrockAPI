package org.bukkit;

import java.io.Serializable;
import org.bukkit.Color;
import org.bukkit.DyeColor;


public enum DyeColor  {

	WHITE,
	ORANGE,
	MAGENTA,
	LIGHT_BLUE,
	YELLOW,
	LIME,
	PINK,
	GRAY,
	SILVER,
	CYAN,
	PURPLE,
	BLUE,
	BROWN,
	GREEN,
	RED,
	BLACK,
	;

	@Deprecated public byte getData() {
		return 0;
	}

	@Deprecated public byte getWoolData() {
		return 0;
	}

	@Deprecated public byte getDyeData() {
		return 0;
	}

	public Color getColor() {
		return null;
	}

	public Color getFireworkColor() {
		return null;
	}

	@Deprecated public static DyeColor getByData(byte data) {
		return null;
	}

	@Deprecated public static DyeColor getByWoolData(byte data) {
		return null;
	}

	@Deprecated public static DyeColor getByDyeData(byte data) {
		return null;
	}

	public static DyeColor getByColor(Color color) {
		return null;
	}

	public static DyeColor getByFireworkColor(Color color) {
		return null;
	}
}
