package org.bukkit.event;

import java.io.Serializable;


public class EventException extends Exception  {


	public Throwable getCause() {
		return null;
	}
}
