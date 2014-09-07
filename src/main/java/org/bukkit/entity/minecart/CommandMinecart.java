package org.bukkit.entity.minecart;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Minecart;
import org.bukkit.entity.Vehicle;
import org.bukkit.metadata.Metadatable;
import org.bukkit.permissions.Permissible;
import org.bukkit.permissions.ServerOperator;


public interface CommandMinecart extends Minecart, CommandSender  {


	String getCommand();

	void setCommand(String command);

	void setName(String name);
}
