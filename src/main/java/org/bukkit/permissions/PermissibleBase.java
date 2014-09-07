package org.bukkit.permissions;

import java.util.Set;
import org.bukkit.permissions.Permissible;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.permissions.ServerOperator;
import org.bukkit.plugin.Plugin;


public class PermissibleBase extends Object implements Permissible  {


	public PermissibleBase(ServerOperator opable) {
	}

	public boolean isOp() {
		return false;
	}

	public void setOp(boolean value) {
	}

	public boolean isPermissionSet(String name) {
		return false;
	}

	public boolean isPermissionSet(Permission perm) {
		return false;
	}

	public boolean hasPermission(String inName) {
		return false;
	}

	public boolean hasPermission(Permission perm) {
		return false;
	}

	public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value) {
		return null;
	}

	public PermissionAttachment addAttachment(Plugin plugin) {
		return null;
	}

	public void removeAttachment(PermissionAttachment attachment) {
	}

	public void recalculatePermissions() {
	}

	public void clearPermissions() {
	}

	public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value, int ticks) {
		return null;
	}

	public PermissionAttachment addAttachment(Plugin plugin, int ticks) {
		return null;
	}

	public Set<PermissionAttachmentInfo> getEffectivePermissions() {
		return null;
	}
}
