package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.material.DetectorRail;
import org.bukkit.material.ExtendedRails;
import org.bukkit.material.MaterialData;
import org.bukkit.material.PressureSensor;
import org.bukkit.material.Rails;


public class DetectorRail extends ExtendedRails implements PressureSensor  {


	public DetectorRail() {
	}

	@Deprecated public DetectorRail(int type) {
	}

	public DetectorRail(Material type) {
	}

	@Deprecated public DetectorRail(int type, byte data) {
	}

	@Deprecated public DetectorRail(Material type, byte data) {
	}

	public boolean isPressed() {
		return false;
	}

	public void setPressed(boolean isPressed) {
	}

	public DetectorRail clone() {
		return null;
	}
}
