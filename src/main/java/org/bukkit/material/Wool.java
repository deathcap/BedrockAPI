package org.bukkit.material;

import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.material.Colorable;
import org.bukkit.material.MaterialData;
import org.bukkit.material.Wool;


public class Wool extends MaterialData implements Colorable  {


	public Wool() {
	}

	public Wool(DyeColor color) {
	}

	@Deprecated public Wool(int type) {
	}

	public Wool(Material type) {
	}

	@Deprecated public Wool(int type, byte data) {
	}

	@Deprecated public Wool(Material type, byte data) {
	}

	public DyeColor getColor() {
		return null;
	}

	public void setColor(DyeColor color) {
	}

	public String toString() {
		return null;
	}

	public Wool clone() {
		return null;
	}
}
