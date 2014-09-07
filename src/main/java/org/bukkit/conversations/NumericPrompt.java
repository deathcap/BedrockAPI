package org.bukkit.conversations;

import org.bukkit.conversations.ConversationContext;
import org.bukkit.conversations.Prompt;
import org.bukkit.conversations.ValidatingPrompt;


public abstract class NumericPrompt extends ValidatingPrompt  {


	protected boolean isInputValid(ConversationContext context, String input) {
		return false;
	}

	protected boolean isNumberValid(ConversationContext context, Number input) {
		return false;
	}

	protected Prompt acceptValidatedInput(ConversationContext context, String input) {
		return null;
	}

	protected abstract Prompt acceptValidatedInput(ConversationContext context, Number input);

	protected String getFailedValidationText(ConversationContext context, String invalidInput) {
		return null;
	}

	protected String getInputNotNumericText(ConversationContext context, String invalidInput) {
		return null;
	}

	protected String getFailedValidationText(ConversationContext context, Number invalidInput) {
		return null;
	}
}
