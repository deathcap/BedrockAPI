package org.bukkit.conversations;

import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.ConversationCanceller;
import org.bukkit.conversations.ConversationContext;
import org.bukkit.conversations.ExactMatchConversationCanceller;
import org.bukkit.conversations.InactivityConversationCanceller;
import org.bukkit.conversations.ManuallyAbandonedConversationCanceller;


public interface ConversationCanceller extends Cloneable  {


	void setConversation(Conversation conversation);

	boolean cancelBasedOnInput(ConversationContext context, String input);

	ConversationCanceller clone();
}
