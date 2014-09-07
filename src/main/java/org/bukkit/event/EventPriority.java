package org.bukkit.event;

import java.io.Serializable;
import org.bukkit.event.EventPriority;


public enum EventPriority  {

	LOWEST,
	LOW,
	NORMAL,
	HIGH,
	HIGHEST,
	MONITOR,
	;

	public int getSlot() {
		return 0;
	}
}
