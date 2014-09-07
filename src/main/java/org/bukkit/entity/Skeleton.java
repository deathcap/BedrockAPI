package org.bukkit.entity;

import java.io.Serializable;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Skeleton.SkeletonType;
import org.bukkit.entity.Creature;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Skeleton.SkeletonType;
import org.bukkit.metadata.Metadatable;
import org.bukkit.projectiles.ProjectileSource;


public interface Skeleton extends Monster  {


	Skeleton.SkeletonType getSkeletonType();

	void setSkeletonType(Skeleton.SkeletonType type);

	
	
	
	public static enum SkeletonType  {
	
		NORMAL,
		WITHER,
		;
	
		@Deprecated public int getId() {
			return 0;
		}
	
		@Deprecated public static SkeletonType getType(int id) {
			return null;
		}
	}
}
