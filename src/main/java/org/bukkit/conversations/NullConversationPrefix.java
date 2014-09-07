package org.bukkit.conversations;

import org.bukkit.conversations.ConversationContext;
import org.bukkit.conversations.ConversationPrefix;


public class NullConversationPrefix extends Object implements ConversationPrefix  {


	public NullConversationPrefix() {
	}

	public String getPrefix(ConversationContext context) {
		return null;
	}
}
