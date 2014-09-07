package org.bukkit.entity;

import java.util.Set;
import org.bukkit.entity.ComplexEntityPart;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.metadata.Metadatable;
import org.bukkit.projectiles.ProjectileSource;


public interface ComplexLivingEntity extends LivingEntity  {


	Set<ComplexEntityPart> getParts();
}
