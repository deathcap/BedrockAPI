package org.bukkit.conversations;

import java.io.Serializable;
import java.util.EventObject;
import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.ConversationCanceller;
import org.bukkit.conversations.ConversationContext;


public class ConversationAbandonedEvent extends EventObject  {


    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException
     *          if source is null.
     */
    public ConversationAbandonedEvent(Object source) {
        super(source);
    }

    public ConversationCanceller getCanceller() {
		return null;
	}

	public ConversationContext getContext() {
		return null;
	}

	public boolean gracefulExit() {
		return false;
	}
}
