package org.bukkit.help;

import java.util.Collection;
import org.bukkit.command.CommandSender;
import org.bukkit.help.HelpTopic;


public class IndexHelpTopic extends HelpTopic  {


	protected String permission = null;

	protected String preamble = null;

	protected Collection<HelpTopic> allTopics = null;

	public IndexHelpTopic(String name, String shortText, String permission, Collection<HelpTopic> topics) {
	}

	public IndexHelpTopic(String name, String shortText, String permission, Collection<HelpTopic> topics, String preamble) {
	}

	protected void setTopicsCollection(Collection<HelpTopic> topics) {
	}

	public boolean canSee(CommandSender sender) {
		return false;
	}

	public void amendCanSee(String amendedPermission) {
	}

	public String getFullText(CommandSender sender) {
		return null;
	}

	protected String buildPreamble(CommandSender sender) {
		return null;
	}

	protected String buildIndexLine(CommandSender sender, HelpTopic topic) {
		return null;
	}
}
