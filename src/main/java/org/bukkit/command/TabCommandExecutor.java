package org.bukkit.command;

import java.util.List;
import org.bukkit.command.CommandExecutor;


@Deprecated public interface TabCommandExecutor extends CommandExecutor  {


	List<String> onTabComplete();
}
