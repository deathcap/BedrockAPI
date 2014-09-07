package org.bukkit.conversations;

import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.ConversationCanceller;
import org.bukkit.conversations.ConversationContext;


public class ManuallyAbandonedConversationCanceller extends Object implements ConversationCanceller  {


	public void setConversation(Conversation conversation) {
	}

	public boolean cancelBasedOnInput(ConversationContext context, String input) {
		return false;
	}

	public ConversationCanceller clone() {
		return null;
	}
}
