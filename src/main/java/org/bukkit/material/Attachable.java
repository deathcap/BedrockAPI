package org.bukkit.material;

import org.bukkit.block.BlockFace;
import org.bukkit.entity.Hanging;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.LeashHitch;
import org.bukkit.entity.Painting;
import org.bukkit.material.Button;
import org.bukkit.material.CocoaPlant;
import org.bukkit.material.Directional;
import org.bukkit.material.Ladder;
import org.bukkit.material.Lever;
import org.bukkit.material.PistonExtensionMaterial;
import org.bukkit.material.RedstoneTorch;
import org.bukkit.material.Sign;
import org.bukkit.material.SimpleAttachableMaterialData;
import org.bukkit.material.Torch;
import org.bukkit.material.TrapDoor;
import org.bukkit.material.TripwireHook;


public interface Attachable extends Directional  {


	BlockFace getAttachedFace();
}
