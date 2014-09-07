package org.bukkit.command;

import java.util.List;
import org.bukkit.command.Command;
import org.bukkit.command.CommandMap;
import org.bukkit.command.CommandSender;
import org.bukkit.command.FormattedCommandAlias;
import org.bukkit.command.MultipleCommandAlias;
import org.bukkit.command.PluginCommand;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.command.defaults.VanillaCommand;


public abstract class Command extends Object  {


	protected String description = null;

	protected String usageMessage = null;

	protected Command(String name) {
	}

	protected Command(String name, String description, String usageMessage, List<String> aliases) {
	}

	public abstract boolean execute(CommandSender sender, String commandLabel, String[] args);

	@Deprecated public List<String> tabComplete(CommandSender sender, String[] args) {
		return null;
	}

	public List<String> tabComplete(CommandSender sender, String alias, String[] args) throws IllegalArgumentException {
		return null;
	}

	public String getName() {
		return null;
	}

	public String getPermission() {
		return null;
	}

	public void setPermission(String permission) {
	}

	public boolean testPermission(CommandSender target) {
		return false;
	}

	public boolean testPermissionSilent(CommandSender target) {
		return false;
	}

	public String getLabel() {
		return null;
	}

	public boolean setLabel(String name) {
		return false;
	}

	public boolean register(CommandMap commandMap) {
		return false;
	}

	public boolean unregister(CommandMap commandMap) {
		return false;
	}

	public boolean isRegistered() {
		return false;
	}

	public List<String> getAliases() {
		return null;
	}

	public String getPermissionMessage() {
		return null;
	}

	public String getDescription() {
		return null;
	}

	public String getUsage() {
		return null;
	}

	public Command setAliases(List<String> aliases) {
		return null;
	}

	public Command setDescription(String description) {
		return null;
	}

	public Command setPermissionMessage(String permissionMessage) {
		return null;
	}

	public Command setUsage(String usage) {
		return null;
	}

	public static void broadcastCommandMessage(CommandSender source, String message) {
	}

	public static void broadcastCommandMessage(CommandSender source, String message, boolean sendToSource) {
	}

	public String toString() {
		return null;
	}
}
