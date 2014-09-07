package org.bukkit.conversations;

import java.util.List;
import java.util.Map;
import org.bukkit.conversations.Conversable;
import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.ConversationAbandonedListener;
import org.bukkit.conversations.ConversationCanceller;
import org.bukkit.conversations.ConversationFactory;
import org.bukkit.conversations.ConversationPrefix;
import org.bukkit.conversations.Prompt;
import org.bukkit.plugin.Plugin;


public class ConversationFactory extends Object  {


	protected Plugin plugin = null;

	protected boolean isModal = false;

	protected boolean localEchoEnabled = false;

	protected ConversationPrefix prefix = null;

	protected Prompt firstPrompt = null;

	protected Map<Object,Object> initialSessionData = null;

	protected String playerOnlyMessage = null;

	protected List<ConversationCanceller> cancellers = null;

	protected List<ConversationAbandonedListener> abandonedListeners = null;

	public ConversationFactory(Plugin plugin) {
	}

	public ConversationFactory withModality(boolean modal) {
		return null;
	}

	public ConversationFactory withLocalEcho(boolean localEchoEnabled) {
		return null;
	}

	public ConversationFactory withPrefix(ConversationPrefix prefix) {
		return null;
	}

	public ConversationFactory withTimeout(int timeoutSeconds) {
		return null;
	}

	public ConversationFactory withFirstPrompt(Prompt firstPrompt) {
		return null;
	}

	public ConversationFactory withInitialSessionData(Map<Object,Object> initialSessionData) {
		return null;
	}

	public ConversationFactory withEscapeSequence(String escapeSequence) {
		return null;
	}

	public ConversationFactory withConversationCanceller(ConversationCanceller canceller) {
		return null;
	}

	public ConversationFactory thatExcludesNonPlayersWithMessage(String playerOnlyMessage) {
		return null;
	}

	public ConversationFactory addConversationAbandonedListener(ConversationAbandonedListener listener) {
		return null;
	}

	public Conversation buildConversation(Conversable forWhom) {
		return null;
	}
}
