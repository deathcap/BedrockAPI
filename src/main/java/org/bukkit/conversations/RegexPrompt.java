package org.bukkit.conversations;

import java.util.regex.Pattern;
import org.bukkit.conversations.ConversationContext;
import org.bukkit.conversations.Prompt;
import org.bukkit.conversations.ValidatingPrompt;


public abstract class RegexPrompt extends ValidatingPrompt  {


	protected boolean isInputValid(ConversationContext context, String input) {
		return false;
	}
}
