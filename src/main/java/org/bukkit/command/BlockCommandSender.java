package org.bukkit.command;

import org.bukkit.block.Block;
import org.bukkit.command.CommandSender;
import org.bukkit.permissions.Permissible;
import org.bukkit.permissions.ServerOperator;


public interface BlockCommandSender extends CommandSender  {


	Block getBlock();
}
