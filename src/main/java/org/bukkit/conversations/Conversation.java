package org.bukkit.conversations;

import java.io.Serializable;
import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.Conversation.ConversationState;
import java.util.List;
import java.util.Map;
import org.bukkit.conversations.Conversable;
import org.bukkit.conversations.Conversation.ConversationState;
import org.bukkit.conversations.ConversationAbandonedEvent;
import org.bukkit.conversations.ConversationAbandonedListener;
import org.bukkit.conversations.ConversationCanceller;
import org.bukkit.conversations.ConversationContext;
import org.bukkit.conversations.ConversationPrefix;
import org.bukkit.conversations.Prompt;
import org.bukkit.plugin.Plugin;


public class Conversation extends Object  {


	public Conversable getForWhom() {
		return null;
	}

	public boolean isModal() {
		return false;
	}

	public boolean isLocalEchoEnabled() {
		return false;
	}

	public void setLocalEchoEnabled(boolean localEchoEnabled) {
	}

	public ConversationPrefix getPrefix() {
		return null;
	}

	public List<ConversationCanceller> getCancellers() {
		return null;
	}

	public ConversationContext getContext() {
		return null;
	}

	public void begin() {
	}

	public Conversation.ConversationState getState() {
		return null;
	}

	public void acceptInput(String input) {
	}

	public void addConversationAbandonedListener(ConversationAbandonedListener listener) {
	}

	public void removeConversationAbandonedListener(ConversationAbandonedListener listener) {
	}

	public void abandon() {
	}

	public void abandon(ConversationAbandonedEvent details) {
	}

	public void outputNextPrompt() {
	}

	
	
	
	public static enum ConversationState  {
	
		UNSTARTED,
		STARTED,
		ABANDONED,
		;
	
	
	}
}
