package org.bukkit.conversations;

import org.bukkit.conversations.ConversationContext;
import org.bukkit.conversations.Prompt;
import org.bukkit.conversations.ValidatingPrompt;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;


public abstract class PlayerNamePrompt extends ValidatingPrompt  {


	public PlayerNamePrompt(Plugin plugin) {
	}

	protected boolean isInputValid(ConversationContext context, String input) {
		return false;
	}

	protected Prompt acceptValidatedInput(ConversationContext context, String input) {
		return null;
	}

	protected abstract Prompt acceptValidatedInput(ConversationContext context, Player input);
}
