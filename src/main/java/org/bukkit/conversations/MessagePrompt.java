package org.bukkit.conversations;

import org.bukkit.conversations.ConversationContext;
import org.bukkit.conversations.Prompt;


public abstract class MessagePrompt extends Object implements Prompt  {


	public MessagePrompt() {
	}

	public boolean blocksForInput(ConversationContext context) {
		return false;
	}

	public Prompt acceptInput(ConversationContext context, String input) {
		return null;
	}

	protected abstract Prompt getNextPrompt(ConversationContext context);
}
