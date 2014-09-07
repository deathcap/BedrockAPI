package org.bukkit.conversations;

import org.bukkit.conversations.ConversationContext;
import org.bukkit.conversations.Prompt;


public abstract class StringPrompt extends Object implements Prompt  {


	public StringPrompt() {
	}

	public boolean blocksForInput(ConversationContext context) {
		return false;
	}
}
