package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.TreeSpecies;
import org.bukkit.material.MaterialData;
import org.bukkit.material.WoodenStep;


public class WoodenStep extends MaterialData  {


	public WoodenStep() {
	}

	@Deprecated public WoodenStep(int type) {
	}

	public WoodenStep(TreeSpecies species) {
	}

	public WoodenStep(TreeSpecies species, boolean inv) {
	}

	@Deprecated public WoodenStep(int type, byte data) {
	}

	@Deprecated public WoodenStep(Material type, byte data) {
	}

	public TreeSpecies getSpecies() {
		return null;
	}

	public void setSpecies(TreeSpecies species) {
	}

	public boolean isInverted() {
		return false;
	}

	public void setInverted(boolean inv) {
	}

	public WoodenStep clone() {
		return null;
	}

	public String toString() {
		return null;
	}
}
