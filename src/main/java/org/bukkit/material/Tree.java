package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.TreeSpecies;
import org.bukkit.block.BlockFace;
import org.bukkit.material.MaterialData;
import org.bukkit.material.Tree;


public class Tree extends MaterialData  {


	public Tree() {
	}

	public Tree(TreeSpecies species) {
	}

	public Tree(TreeSpecies species, BlockFace dir) {
	}

	@Deprecated public Tree(int type) {
	}

	public Tree(Material type) {
	}

	@Deprecated public Tree(int type, byte data) {
	}

	@Deprecated public Tree(Material type, byte data) {
	}

	public TreeSpecies getSpecies() {
		return null;
	}

	public void setSpecies(TreeSpecies species) {
	}

	public BlockFace getDirection() {
		return null;
	}

	public void setDirection(BlockFace dir) {
	}

	public String toString() {
		return null;
	}

	public Tree clone() {
		return null;
	}
}
