package org.bukkit.event;

import java.io.Serializable;


public class EventException extends Exception  {


	public EventException(Throwable throwable) {
	}

	public EventException() {
	}

	public EventException(Throwable cause, String message) {
	}

	public EventException(String message) {
	}

	public Throwable getCause() {
		return null;
	}
}
