package org.bukkit.map;

import java.io.Serializable;
import org.bukkit.map.MapView;
import org.bukkit.map.MapView.Scale;
import java.util.List;
import org.bukkit.World;
import org.bukkit.map.MapRenderer;
import org.bukkit.map.MapView.Scale;


public interface MapView  {


	@Deprecated short getId();

	boolean isVirtual();

	MapView.Scale getScale();

	void setScale(MapView.Scale scale);

	int getCenterX();

	int getCenterZ();

	void setCenterX(int x);

	void setCenterZ(int z);

	World getWorld();

	void setWorld(World world);

	List<MapRenderer> getRenderers();

	void addRenderer(MapRenderer renderer);

	boolean removeRenderer(MapRenderer renderer);

	
	
	
	public static enum Scale  {
	
		CLOSEST,
		CLOSE,
		NORMAL,
		FAR,
		FARTHEST,
		;
	
	
	
	
		@Deprecated public byte getValue() {
			return 0;
		}
	}
}
