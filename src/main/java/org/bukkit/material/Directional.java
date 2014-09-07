package org.bukkit.material;

import org.bukkit.block.BlockFace;
import org.bukkit.entity.Hanging;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.LeashHitch;
import org.bukkit.entity.Painting;
import org.bukkit.material.Attachable;
import org.bukkit.material.Bed;
import org.bukkit.material.Button;
import org.bukkit.material.Chest;
import org.bukkit.material.CocoaPlant;
import org.bukkit.material.Diode;
import org.bukkit.material.DirectionalContainer;
import org.bukkit.material.Dispenser;
import org.bukkit.material.Door;
import org.bukkit.material.EnderChest;
import org.bukkit.material.Furnace;
import org.bukkit.material.FurnaceAndDispenser;
import org.bukkit.material.Gate;
import org.bukkit.material.Ladder;
import org.bukkit.material.Lever;
import org.bukkit.material.PistonBaseMaterial;
import org.bukkit.material.PistonExtensionMaterial;
import org.bukkit.material.Pumpkin;
import org.bukkit.material.RedstoneTorch;
import org.bukkit.material.Sign;
import org.bukkit.material.SimpleAttachableMaterialData;
import org.bukkit.material.Skull;
import org.bukkit.material.Stairs;
import org.bukkit.material.Torch;
import org.bukkit.material.TrapDoor;
import org.bukkit.material.TripwireHook;


public interface Directional  {


	void setFacingDirection(BlockFace face);

	BlockFace getFacing();
}
