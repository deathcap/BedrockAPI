package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;
import org.bukkit.material.PressurePlate;
import org.bukkit.material.PressureSensor;


public class PressurePlate extends MaterialData implements PressureSensor  {


	public PressurePlate() {
	}

	@Deprecated public PressurePlate(int type) {
	}

	public PressurePlate(Material type) {
	}

	@Deprecated public PressurePlate(int type, byte data) {
	}

	@Deprecated public PressurePlate(Material type, byte data) {
	}

	public boolean isPressed() {
		return false;
	}

	public String toString() {
		return null;
	}

	public PressurePlate clone() {
		return null;
	}
}
