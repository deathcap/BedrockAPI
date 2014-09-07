package org.bukkit.permissions;

import java.util.Set;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.RemoteConsoleCommandSender;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.minecart.CommandMinecart;
import org.bukkit.permissions.PermissibleBase;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.permissions.ServerOperator;
import org.bukkit.plugin.Plugin;


public interface Permissible extends ServerOperator  {


	boolean isPermissionSet(String name);

	boolean isPermissionSet(Permission perm);

	boolean hasPermission(String name);

	boolean hasPermission(Permission perm);

	PermissionAttachment addAttachment(Plugin plugin, String name, boolean value);

	PermissionAttachment addAttachment(Plugin plugin);

	PermissionAttachment addAttachment(Plugin plugin, String name, boolean value, int ticks);

	PermissionAttachment addAttachment(Plugin plugin, int ticks);

	void removeAttachment(PermissionAttachment attachment);

	void recalculatePermissions();

	Set<PermissionAttachmentInfo> getEffectivePermissions();
}
