package org.bukkit;

import org.bukkit.Location;
import org.bukkit.TravelAgent;


public interface TravelAgent  {


	TravelAgent setSearchRadius(int radius);

	int getSearchRadius();

	TravelAgent setCreationRadius(int radius);

	int getCreationRadius();

	boolean getCanCreatePortal();

	void setCanCreatePortal(boolean create);

	Location findOrCreate(Location location);

	Location findPortal(Location location);

	boolean createPortal(Location location);
}
