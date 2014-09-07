package org.bukkit.command;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.TabCompleter;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginBase;
import org.bukkit.plugin.java.JavaPlugin;


public interface TabExecutor extends TabCompleter, CommandExecutor  {

}
