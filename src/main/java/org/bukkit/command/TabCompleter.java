package org.bukkit.command;

import java.util.List;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginBase;
import org.bukkit.plugin.java.JavaPlugin;


public interface TabCompleter  {


	List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args);
}
