package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.material.Cake;
import org.bukkit.material.MaterialData;


public class Cake extends MaterialData  {


	public Cake() {
	}

	@Deprecated public Cake(int type) {
	}

	public Cake(Material type) {
	}

	@Deprecated public Cake(int type, byte data) {
	}

	@Deprecated public Cake(Material type, byte data) {
	}

	public int getSlicesEaten() {
		return 0;
	}

	public int getSlicesRemaining() {
		return 0;
	}

	public void setSlicesEaten(int n) {
	}

	public void setSlicesRemaining(int n) {
	}

	public String toString() {
		return null;
	}

	public Cake clone() {
		return null;
	}
}
