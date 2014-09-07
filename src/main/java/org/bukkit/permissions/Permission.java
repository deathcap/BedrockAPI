package org.bukkit.permissions;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bukkit.permissions.Permissible;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionDefault;


public class Permission extends Object  {


	public static final PermissionDefault DEFAULT_PERMISSION = null;

	public Permission(String name) {
	}

	public Permission(String name, String description) {
	}

	public Permission(String name, PermissionDefault defaultValue) {
	}

	public Permission(String name, String description, PermissionDefault defaultValue) {
	}

	public Permission(String name, Map<String,Boolean> children) {
	}

	public Permission(String name, String description, Map<String,Boolean> children) {
	}

	public Permission(String name, PermissionDefault defaultValue, Map<String,Boolean> children) {
	}

	public Permission(String name, String description, PermissionDefault defaultValue, Map<String,Boolean> children) {
	}

	public String getName() {
		return null;
	}

	public Map<String,Boolean> getChildren() {
		return null;
	}

	public PermissionDefault getDefault() {
		return null;
	}

	public void setDefault(PermissionDefault value) {
	}

	public String getDescription() {
		return null;
	}

	public void setDescription(String value) {
	}

	public Set<Permissible> getPermissibles() {
		return null;
	}

	public void recalculatePermissibles() {
	}

	public Permission addParent(String name, boolean value) {
		return null;
	}

	public void addParent(Permission perm, boolean value) {
	}

	public static List<Permission> loadPermissions(Map<?,?> data, String error, PermissionDefault def) {
		return null;
	}

	public static Permission loadPermission(String name, Map<String,Object> data) {
		return null;
	}

	public static Permission loadPermission(String name, Map<?,?> data, PermissionDefault def, List<Permission> output) {
		return null;
	}
}
