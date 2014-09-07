package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.material.Command;
import org.bukkit.material.MaterialData;
import org.bukkit.material.Redstone;


public class Command extends MaterialData implements Redstone  {


	public boolean isPowered() {
		return false;
	}

	public void setPowered(boolean bool) {
	}

	public String toString() {
		return null;
	}

	public Command clone() {
		return null;
	}
}
