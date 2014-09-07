package org.bukkit.conversations;

import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.ConversationAbandonedEvent;
import org.bukkit.entity.Player;


public interface Conversable  {


	boolean isConversing();

	void acceptConversationInput(String input);

	boolean beginConversation(Conversation conversation);

	void abandonConversation(Conversation conversation);

	void abandonConversation(Conversation conversation, ConversationAbandonedEvent details);

	void sendRawMessage(String message);
}
