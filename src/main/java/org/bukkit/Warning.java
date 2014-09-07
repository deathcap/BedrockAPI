package org.bukkit;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.bukkit.Warning;
import org.bukkit.Warning.WarningState;


@Target(value={ElementType.CONSTRUCTOR,ElementType.METHOD,ElementType.TYPE}) @Retention(value= RetentionPolicy.RUNTIME) public @interface Warning  {


	
	
	
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
