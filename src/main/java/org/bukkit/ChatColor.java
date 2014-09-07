package org.bukkit;

import java.io.Serializable;
import org.bukkit.ChatColor;


public enum ChatColor  {

	BLACK,
	DARK_BLUE,
	DARK_GREEN,
	DARK_AQUA,
	DARK_RED,
	DARK_PURPLE,
	GOLD,
	GRAY,
	DARK_GRAY,
	BLUE,
	GREEN,
	AQUA,
	RED,
	LIGHT_PURPLE,
	YELLOW,
	WHITE,
	MAGIC,
	BOLD,
	STRIKETHROUGH,
	UNDERLINE,
	ITALIC,
	RESET,
	COLOR_CHAR,
	;

	public char getChar() {
		return '\0';
	}

	public String toString() {
		return null;
	}

	public boolean isFormat() {
		return false;
	}

	public boolean isColor() {
		return false;
	}

	public static ChatColor getByChar(char code) {
		return null;
	}

	public static ChatColor getByChar(String code) {
		return null;
	}

	public static String stripColor(String input) {
		return null;
	}

	public static String translateAlternateColorCodes(char altColorChar, String textToTranslate) {
		return null;
	}

	public static String getLastColors(String input) {
		return null;
	}
}
