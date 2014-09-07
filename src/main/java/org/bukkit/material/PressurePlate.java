package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;
import org.bukkit.material.PressurePlate;
import org.bukkit.material.PressureSensor;


public class PressurePlate extends MaterialData implements PressureSensor  {


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
