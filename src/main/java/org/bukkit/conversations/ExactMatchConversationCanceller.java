package org.bukkit.conversations;

import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.ConversationCanceller;
import org.bukkit.conversations.ConversationContext;


public class ExactMatchConversationCanceller extends Object implements ConversationCanceller  {


	public ExactMatchConversationCanceller(String escapeSequence) {
	}

	public void setConversation(Conversation conversation) {
	}

	public boolean cancelBasedOnInput(ConversationContext context, String input) {
		return false;
	}

	public ConversationCanceller clone() {
		return null;
	}
}
