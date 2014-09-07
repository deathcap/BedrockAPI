package org.bukkit.map;

import java.awt.Image;
import org.bukkit.map.MapCursorCollection;
import org.bukkit.map.MapFont;
import org.bukkit.map.MapView;


public interface MapCanvas  {


	MapView getMapView();

	MapCursorCollection getCursors();

	void setCursors(MapCursorCollection cursors);

	void setPixel(int x, int y, byte color);

	byte getPixel(int x, int y);

	byte getBasePixel(int x, int y);

	void drawImage(int x, int y, Image image);

	void drawText(int x, int y, MapFont font, String text);
}
