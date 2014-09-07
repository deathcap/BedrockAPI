package org.bukkit.plugin.messaging;

import java.util.Set;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.messaging.PluginMessageListener;
import org.bukkit.plugin.messaging.PluginMessageListenerRegistration;
import org.bukkit.plugin.messaging.StandardMessenger;


public interface Messenger  {


	static final int MAX_MESSAGE_SIZE = 0;

	static final int MAX_CHANNEL_SIZE = 0;

	boolean isReservedChannel(String channel);

	void registerOutgoingPluginChannel(Plugin plugin, String channel);

	void unregisterOutgoingPluginChannel(Plugin plugin, String channel);

	void unregisterOutgoingPluginChannel(Plugin plugin);

	PluginMessageListenerRegistration registerIncomingPluginChannel(Plugin plugin, String channel, PluginMessageListener listener);

	void unregisterIncomingPluginChannel(Plugin plugin, String channel, PluginMessageListener listener);

	void unregisterIncomingPluginChannel(Plugin plugin, String channel);

	void unregisterIncomingPluginChannel(Plugin plugin);

	Set<String> getOutgoingChannels();

	Set<String> getOutgoingChannels(Plugin plugin);

	Set<String> getIncomingChannels();

	Set<String> getIncomingChannels(Plugin plugin);

	Set<PluginMessageListenerRegistration> getIncomingChannelRegistrations(Plugin plugin);

	Set<PluginMessageListenerRegistration> getIncomingChannelRegistrations(String channel);

	Set<PluginMessageListenerRegistration> getIncomingChannelRegistrations(Plugin plugin, String channel);

	boolean isRegistrationValid(PluginMessageListenerRegistration registration);

	boolean isIncomingChannelRegistered(Plugin plugin, String channel);

	boolean isOutgoingChannelRegistered(Plugin plugin, String channel);

	void dispatchIncomingMessage(Player source, String channel, byte[] message);
}
