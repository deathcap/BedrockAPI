package org.bukkit.conversations;

import org.bukkit.conversations.BooleanPrompt;
import org.bukkit.conversations.ConversationContext;
import org.bukkit.conversations.FixedSetPrompt;
import org.bukkit.conversations.NumericPrompt;
import org.bukkit.conversations.PlayerNamePrompt;
import org.bukkit.conversations.Prompt;
import org.bukkit.conversations.RegexPrompt;


public abstract class ValidatingPrompt extends Object implements Prompt  {


	public Prompt acceptInput(ConversationContext context, String input) {
		return null;
	}

	public boolean blocksForInput(ConversationContext context) {
		return false;
	}

	protected abstract boolean isInputValid(ConversationContext context, String input);

	protected abstract Prompt acceptValidatedInput(ConversationContext context, String input);

	protected String getFailedValidationText(ConversationContext context, String invalidInput) {
		return null;
	}
}
