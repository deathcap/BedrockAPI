package org.bukkit.plugin.messaging;

import org.bukkit.entity.Player;


public interface PluginMessageListener  {


	void onPluginMessageReceived(String channel, Player player, byte[] message);
}
