package org.bukkit.conversations;

import java.util.List;
import org.bukkit.conversations.ConversationContext;
import org.bukkit.conversations.Prompt;
import org.bukkit.conversations.ValidatingPrompt;


public abstract class FixedSetPrompt extends ValidatingPrompt  {


	protected boolean isInputValid(ConversationContext context, String input) {
		return false;
	}

	protected String formatFixedSet() {
		return null;
	}
}
