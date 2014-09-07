package org.bukkit.help;

import java.util.Comparator;
import org.bukkit.help.HelpTopicComparator;
import java.util.Comparator;
import org.bukkit.help.HelpTopic;
import org.bukkit.help.HelpTopicComparator;
import org.bukkit.help.HelpTopicComparator.TopicNameComparator;


public class HelpTopicComparator extends Object implements Comparator<HelpTopic>  {


	public static HelpTopicComparator.TopicNameComparator topicNameComparatorInstance() {
		return null;
	}

	public static HelpTopicComparator helpTopicComparatorInstance() {
		return null;
	}

	public int compare(HelpTopic lhs, HelpTopic rhs) {
		return 0;
	}

	
	
	
	public static class TopicNameComparator extends Object implements Comparator<String>  {
	
	
		public int compare(String lhs, String rhs) {
			return 0;
		}
	}
}
