package org.bukkit.permissions;

import java.io.Serializable;
import org.bukkit.permissions.PermissionDefault;


public enum PermissionDefault  {

	TRUE,
	FALSE,
	OP,
	NOT_OP,
	;



	public boolean getValue(boolean op) {
		return false;
	}

	public static PermissionDefault getByName(String name) {
		return null;
	}

	public String toString() {
		return null;
	}
}
