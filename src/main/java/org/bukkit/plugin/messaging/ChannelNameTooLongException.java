package org.bukkit.plugin.messaging;

import java.io.Serializable;


public class ChannelNameTooLongException extends RuntimeException  {


	public ChannelNameTooLongException() {
	}

	public ChannelNameTooLongException(String channel) {
	}
}
