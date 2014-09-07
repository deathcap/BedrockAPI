package org.bukkit.conversations;

import java.util.EventListener;
import org.bukkit.conversations.ConversationAbandonedEvent;


public interface ConversationAbandonedListener extends EventListener  {


	void conversationAbandoned(ConversationAbandonedEvent abandonedEvent);
}
