package org.bukkit.conversations;

import org.bukkit.conversations.ConversationContext;
import org.bukkit.conversations.Prompt;
import org.bukkit.conversations.ValidatingPrompt;


public abstract class BooleanPrompt extends ValidatingPrompt  {


	public BooleanPrompt() {
	}

	protected boolean isInputValid(ConversationContext context, String input) {
		return false;
	}

	protected Prompt acceptValidatedInput(ConversationContext context, String input) {
		return null;
	}

	protected abstract Prompt acceptValidatedInput(ConversationContext context, boolean input);
}
