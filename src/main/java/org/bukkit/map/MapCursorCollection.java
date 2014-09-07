package org.bukkit.map;

import org.bukkit.map.MapCursor;


public final class MapCursorCollection extends Object  {


	public int size() {
		return 0;
	}

	public MapCursor getCursor(int index) {
		return null;
	}

	public boolean removeCursor(MapCursor cursor) {
		return false;
	}

	public MapCursor addCursor(MapCursor cursor) {
		return null;
	}

	public MapCursor addCursor(int x, int y, byte direction) {
		return null;
	}

	@Deprecated public MapCursor addCursor(int x, int y, byte direction, byte type) {
		return null;
	}

	@Deprecated public MapCursor addCursor(int x, int y, byte direction, byte type, boolean visible) {
		return null;
	}
}
