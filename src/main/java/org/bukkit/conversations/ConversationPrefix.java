package org.bukkit.conversations;

import org.bukkit.conversations.ConversationContext;
import org.bukkit.conversations.NullConversationPrefix;
import org.bukkit.conversations.PluginNameConversationPrefix;


public interface ConversationPrefix  {


	String getPrefix(ConversationContext context);
}
