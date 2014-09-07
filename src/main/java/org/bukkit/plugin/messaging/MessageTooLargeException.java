package org.bukkit.plugin.messaging;

import java.io.Serializable;


public class MessageTooLargeException extends RuntimeException  {


	public MessageTooLargeException() {
	}

	public MessageTooLargeException(byte[] message) {
	}

	public MessageTooLargeException(int length) {
	}

	public MessageTooLargeException(String msg) {
	}
}
