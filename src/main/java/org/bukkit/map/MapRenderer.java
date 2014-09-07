package org.bukkit.map;

import org.bukkit.entity.Player;
import org.bukkit.map.MapCanvas;
import org.bukkit.map.MapView;


public abstract class MapRenderer extends Object  {


	public MapRenderer() {
	}

	public MapRenderer(boolean contextual) {
	}

	public final boolean isContextual() {
		return false;
	}

	public void initialize(MapView map) {
	}

	public abstract void render(MapView map, MapCanvas canvas, Player player);
}
