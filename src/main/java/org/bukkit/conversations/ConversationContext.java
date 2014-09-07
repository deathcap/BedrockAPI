package org.bukkit.conversations;

import java.util.Map;
import org.bukkit.conversations.Conversable;
import org.bukkit.plugin.Plugin;


public class ConversationContext extends Object  {


	public ConversationContext(Plugin plugin, Conversable forWhom, Map<Object,Object> initialSessionData) {
	}

	public Plugin getPlugin() {
		return null;
	}

	public Conversable getForWhom() {
		return null;
	}

	public Object getSessionData(Object key) {
		return null;
	}

	public void setSessionData(Object key, Object value) {
	}
}
