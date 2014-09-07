package org.bukkit.map;

import org.bukkit.map.MapFont;
import org.bukkit.map.MapFont.CharacterSprite;
import org.bukkit.map.MinecraftFont;


public class MapFont extends Object  {


	public void setChar(char ch, MapFont.CharacterSprite sprite) {
	}

	public MapFont.CharacterSprite getChar(char ch) {
		return null;
	}

	public int getWidth(String text) {
		return 0;
	}

	public int getHeight() {
		return 0;
	}

	public boolean isValid(String text) {
		return false;
	}

	
	
	
	public static class CharacterSprite extends Object  {
	
	
		public boolean get(int row, int col) {
			return false;
		}
	
		public int getWidth() {
			return 0;
		}
	
		public int getHeight() {
			return 0;
		}
	}
}
