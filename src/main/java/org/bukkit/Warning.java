package org.bukkit;

import java.io.Serializable;
import org.bukkit.Warning;
import org.bukkit.Warning.WarningState;


@Target(value={CONSTRUCTOR,METHOD,TYPE}) @Retention(value=RUNTIME) public @interface Warning  {


	
	
	
	public static enum WarningState  {
	
		ON,
		OFF,
		DEFAULT,
		;
	
	
	
		public boolean printFor(Warning warning) {
			return false;
		}
	
		public static WarningState value(String value) {
			return null;
		}
	}
}
