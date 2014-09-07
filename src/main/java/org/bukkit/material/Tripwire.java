package org.bukkit.material;

import org.bukkit.material.MaterialData;
import org.bukkit.material.Tripwire;


public class Tripwire extends MaterialData  {


	public boolean isActivated() {
		return false;
	}

	public void setActivated(boolean act) {
	}

	public boolean isObjectTriggering() {
		return false;
	}

	public void setObjectTriggering(boolean trig) {
	}

	public Tripwire clone() {
		return null;
	}

	public String toString() {
		return null;
	}
}
