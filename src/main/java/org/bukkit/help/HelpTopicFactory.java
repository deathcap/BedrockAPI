package org.bukkit.help;

import org.bukkit.command.Command;
import org.bukkit.help.HelpTopic;


public interface HelpTopicFactory<TCommand extends Command>  {


	HelpTopic createTopic(TCommand command);
}
