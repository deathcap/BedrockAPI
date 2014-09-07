package org.bukkit.conversations;

import org.bukkit.ChatColor;
import org.bukkit.conversations.ConversationContext;
import org.bukkit.conversations.ConversationPrefix;
import org.bukkit.plugin.Plugin;


public class PluginNameConversationPrefix extends Object implements ConversationPrefix  {


	protected String separator = null;

	protected ChatColor prefixColor = null;

	protected Plugin plugin = null;

	public PluginNameConversationPrefix(Plugin plugin) {
	}

	public PluginNameConversationPrefix(Plugin plugin, String separator, ChatColor prefixColor) {
	}

	public String getPrefix(ConversationContext context) {
		return null;
	}
}
