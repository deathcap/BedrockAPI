package org.bukkit.entity;

import org.bukkit.entity.ComplexEntityPart;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Entity;
import org.bukkit.metadata.Metadatable;


public interface EnderDragonPart extends ComplexEntityPart, Damageable  {


	EnderDragon getParent();
}
