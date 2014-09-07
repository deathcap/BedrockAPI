package org.bukkit.help;

import java.util.Collection;
import java.util.List;
import org.bukkit.help.HelpTopic;
import org.bukkit.help.HelpTopicFactory;


public interface HelpMap  {


	HelpTopic getHelpTopic(String topicName);

	Collection<HelpTopic> getHelpTopics();

	void addTopic(HelpTopic topic);

	void clear();

	void registerHelpTopicFactory(Class<?> commandClass, HelpTopicFactory<?> factory);

	List<String> getIgnoredPlugins();
}
