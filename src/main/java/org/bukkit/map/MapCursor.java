package org.bukkit.map;

import java.io.Serializable;
import org.bukkit.map.MapCursor;
import org.bukkit.map.MapCursor.Type;
import org.bukkit.map.MapCursor.Type;


public final class MapCursor extends Object  {


	public byte getX() {
		return 0;
	}

	public byte getY() {
		return 0;
	}

	public byte getDirection() {
		return 0;
	}

	public MapCursor.Type getType() {
		return null;
	}

	@Deprecated public byte getRawType() {
		return 0;
	}

	public boolean isVisible() {
		return false;
	}

	public void setX(byte x) {
	}

	public void setY(byte y) {
	}

	public void setDirection(byte direction) {
	}

	public void setType(MapCursor.Type type) {
	}

	@Deprecated public void setRawType(byte type) {
	}

	public void setVisible(boolean visible) {
	}

	
	
	
	public static enum Type  {
	
		WHITE_POINTER,
		GREEN_POINTER,
		RED_POINTER,
		BLUE_POINTER,
		WHITE_CROSS,
		;
	
	
	
		@Deprecated public byte getValue() {
			return 0;
		}
	
		@Deprecated public static Type byValue(byte value) {
			return null;
		}
	}
}
