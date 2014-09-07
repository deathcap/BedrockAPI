package org.bukkit.material;

import org.bukkit.material.Door;
import org.bukkit.material.Gate;
import org.bukkit.material.TrapDoor;


public interface Openable  {


	boolean isOpen();

	void setOpen(boolean isOpen);
}
