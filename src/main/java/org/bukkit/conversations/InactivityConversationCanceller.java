package org.bukkit.conversations;

import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.ConversationCanceller;
import org.bukkit.conversations.ConversationContext;
import org.bukkit.plugin.Plugin;


public class InactivityConversationCanceller extends Object implements ConversationCanceller  {


	protected Plugin plugin = null;

	protected int timeoutSeconds = 0;

	protected Conversation conversation = null;

	public InactivityConversationCanceller(Plugin plugin, int timeoutSeconds) {
	}

	public void setConversation(Conversation conversation) {
	}

	public boolean cancelBasedOnInput(ConversationContext context, String input) {
		return false;
	}

	public ConversationCanceller clone() {
		return null;
	}

	protected void cancelling(Conversation conversation) {
	}
}
