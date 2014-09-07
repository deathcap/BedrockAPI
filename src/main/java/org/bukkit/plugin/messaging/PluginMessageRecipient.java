package org.bukkit.plugin.messaging;

import java.util.Set;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.messaging.ChannelNotRegisteredException;
import org.bukkit.plugin.messaging.MessageTooLargeException;


public interface PluginMessageRecipient  {


	void sendPluginMessage(Plugin source, String channel, byte[] message);

	Set<String> getListeningPluginChannels();
}
