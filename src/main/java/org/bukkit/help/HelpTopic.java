package org.bukkit.help;

import org.bukkit.command.CommandSender;
import org.bukkit.help.GenericCommandHelpTopic;
import org.bukkit.help.IndexHelpTopic;


public abstract class HelpTopic extends Object  {


	public abstract boolean canSee(CommandSender player);

	public void amendCanSee(String amendedPermission) {
	}

	public String getName() {
		return null;
	}

	public String getShortText() {
		return null;
	}

	public String getFullText(CommandSender forWho) {
		return null;
	}

	public void amendTopic(String amendedShortText, String amendedFullText) {
	}

	protected String applyAmendment(String baseText, String amendment) {
		return null;
	}
}
