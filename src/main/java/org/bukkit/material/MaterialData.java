package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.Bed;
import org.bukkit.material.Cake;
import org.bukkit.material.Cauldron;
import org.bukkit.material.Coal;
import org.bukkit.material.CocoaPlant;
import org.bukkit.material.Command;
import org.bukkit.material.Crops;
import org.bukkit.material.Diode;
import org.bukkit.material.DirectionalContainer;
import org.bukkit.material.Door;
import org.bukkit.material.Dye;
import org.bukkit.material.FlowerPot;
import org.bukkit.material.Gate;
import org.bukkit.material.Leaves;
import org.bukkit.material.LongGrass;
import org.bukkit.material.MaterialData;
import org.bukkit.material.Mushroom;
import org.bukkit.material.NetherWarts;
import org.bukkit.material.PistonBaseMaterial;
import org.bukkit.material.PistonExtensionMaterial;
import org.bukkit.material.PressurePlate;
import org.bukkit.material.Pumpkin;
import org.bukkit.material.Rails;
import org.bukkit.material.RedstoneWire;
import org.bukkit.material.Sandstone;
import org.bukkit.material.Sign;
import org.bukkit.material.SimpleAttachableMaterialData;
import org.bukkit.material.Skull;
import org.bukkit.material.SpawnEgg;
import org.bukkit.material.Stairs;
import org.bukkit.material.TexturedMaterial;
import org.bukkit.material.Tree;
import org.bukkit.material.Tripwire;
import org.bukkit.material.Vine;
import org.bukkit.material.WoodenStep;
import org.bukkit.material.Wool;


public class MaterialData extends Object implements Cloneable  {


	@Deprecated public MaterialData(int type) {
	}

	public MaterialData(Material type) {
	}

	@Deprecated public MaterialData(int type, byte data) {
	}

	@Deprecated public MaterialData(Material type, byte data) {
	}

	@Deprecated public byte getData() {
		return 0;
	}

	@Deprecated public void setData(byte data) {
	}

	public Material getItemType() {
		return null;
	}

	@Deprecated public int getItemTypeId() {
		return 0;
	}

	public ItemStack toItemStack() {
		return null;
	}

	public ItemStack toItemStack(int amount) {
		return null;
	}

	public String toString() {
		return null;
	}

	public int hashCode() {
		return 0;
	}

	public boolean equals(Object obj) {
		return false;
	}

	public MaterialData clone() {
		return null;
	}
}
