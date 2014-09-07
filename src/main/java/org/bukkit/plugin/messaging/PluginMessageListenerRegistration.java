package org.bukkit.plugin.messaging;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.messaging.Messenger;
import org.bukkit.plugin.messaging.PluginMessageListener;


public final class PluginMessageListenerRegistration extends Object  {


	public PluginMessageListenerRegistration(Messenger messenger, Plugin plugin, String channel, PluginMessageListener listener) {
	}

	public String getChannel() {
		return null;
	}

	public PluginMessageListener getListener() {
		return null;
	}

	public Plugin getPlugin() {
		return null;
	}

	public boolean isValid() {
		return false;
	}

	public boolean equals(Object obj) {
		return false;
	}

	public int hashCode() {
		return 0;
	}
}
