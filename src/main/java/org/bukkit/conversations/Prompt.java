package org.bukkit.conversations;

import org.bukkit.conversations.BooleanPrompt;
import org.bukkit.conversations.ConversationContext;
import org.bukkit.conversations.FixedSetPrompt;
import org.bukkit.conversations.MessagePrompt;
import org.bukkit.conversations.NumericPrompt;
import org.bukkit.conversations.PlayerNamePrompt;
import org.bukkit.conversations.Prompt;
import org.bukkit.conversations.RegexPrompt;
import org.bukkit.conversations.StringPrompt;
import org.bukkit.conversations.ValidatingPrompt;


public interface Prompt extends Cloneable  {


	static final Prompt END_OF_CONVERSATION = null;

	String getPromptText(ConversationContext context);

	boolean blocksForInput(ConversationContext context);

	Prompt acceptInput(ConversationContext context, String input);
}
