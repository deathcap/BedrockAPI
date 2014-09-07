package org.bukkit.plugin.messaging;

import java.util.Set;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.messaging.ChannelNameTooLongException;
import org.bukkit.plugin.messaging.ChannelNotRegisteredException;
import org.bukkit.plugin.messaging.MessageTooLargeException;
import org.bukkit.plugin.messaging.Messenger;
import org.bukkit.plugin.messaging.PluginMessageListener;
import org.bukkit.plugin.messaging.PluginMessageListenerRegistration;


public class StandardMessenger extends Object implements Messenger  {


	public StandardMessenger() {
	}

	public boolean isReservedChannel(String channel) {
		return false;
	}

	public void registerOutgoingPluginChannel(Plugin plugin, String channel) {
	}

	public void unregisterOutgoingPluginChannel(Plugin plugin, String channel) {
	}

	public void unregisterOutgoingPluginChannel(Plugin plugin) {
	}

	public PluginMessageListenerRegistration registerIncomingPluginChannel(Plugin plugin, String channel, PluginMessageListener listener) {
		return null;
	}

	public void unregisterIncomingPluginChannel(Plugin plugin, String channel, PluginMessageListener listener) {
	}

	public void unregisterIncomingPluginChannel(Plugin plugin, String channel) {
	}

	public void unregisterIncomingPluginChannel(Plugin plugin) {
	}

	public Set<String> getOutgoingChannels() {
		return null;
	}

	public Set<String> getOutgoingChannels(Plugin plugin) {
		return null;
	}

	public Set<String> getIncomingChannels() {
		return null;
	}

	public Set<String> getIncomingChannels(Plugin plugin) {
		return null;
	}

	public Set<PluginMessageListenerRegistration> getIncomingChannelRegistrations(Plugin plugin) {
		return null;
	}

	public Set<PluginMessageListenerRegistration> getIncomingChannelRegistrations(String channel) {
		return null;
	}

	public Set<PluginMessageListenerRegistration> getIncomingChannelRegistrations(Plugin plugin, String channel) {
		return null;
	}

	public boolean isRegistrationValid(PluginMessageListenerRegistration registration) {
		return false;
	}

	public boolean isIncomingChannelRegistered(Plugin plugin, String channel) {
		return false;
	}

	public boolean isOutgoingChannelRegistered(Plugin plugin, String channel) {
		return false;
	}

	public void dispatchIncomingMessage(Player source, String channel, byte[] message) {
	}

	public static void validateChannel(String channel) {
	}

	public static void validatePluginMessage(Messenger messenger, Plugin source, String channel, byte[] message) {
	}
}
