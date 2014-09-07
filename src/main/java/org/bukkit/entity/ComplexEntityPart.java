package org.bukkit.entity;

import org.bukkit.entity.ComplexLivingEntity;
import org.bukkit.entity.EnderDragonPart;
import org.bukkit.entity.Entity;
import org.bukkit.metadata.Metadatable;


public interface ComplexEntityPart extends Entity  {


	ComplexLivingEntity getParent();
}
