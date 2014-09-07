package org.bukkit.material;

import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.material.Colorable;
import org.bukkit.material.Dye;
import org.bukkit.material.MaterialData;


public class Dye extends MaterialData implements Colorable  {


	public Dye() {
	}

	@Deprecated public Dye(int type) {
	}

	public Dye(Material type) {
	}

	@Deprecated public Dye(int type, byte data) {
	}

	@Deprecated public Dye(Material type, byte data) {
	}

	public DyeColor getColor() {
		return null;
	}

	public void setColor(DyeColor color) {
	}

	public String toString() {
		return null;
	}

	public Dye clone() {
		return null;
	}
}
