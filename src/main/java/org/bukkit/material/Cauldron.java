package org.bukkit.material;

import org.bukkit.material.Cauldron;
import org.bukkit.material.MaterialData;


public class Cauldron extends MaterialData  {


	public Cauldron() {
	}

	@Deprecated public Cauldron(int type, byte data) {
	}

	@Deprecated public Cauldron(byte data) {
	}

	public boolean isFull() {
		return false;
	}

	public boolean isEmpty() {
		return false;
	}

	public String toString() {
		return null;
	}

	public Cauldron clone() {
		return null;
	}
}
