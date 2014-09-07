package org.bukkit.entity;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Ageable;
import org.bukkit.entity.Ambient;
import org.bukkit.entity.Animals;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Bat;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.ComplexLivingEntity;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Creature;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Egg;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Flying;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.Giant;
import org.bukkit.entity.Golem;
import org.bukkit.entity.Horse;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.MagmaCube;
import org.bukkit.entity.Monster;
import org.bukkit.entity.MushroomCow;
import org.bukkit.entity.NPC;
import org.bukkit.entity.Ocelot;
import org.bukkit.entity.Pig;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Silverfish;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Slime;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.Snowman;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Squid;
import org.bukkit.entity.Villager;
import org.bukkit.entity.WaterMob;
import org.bukkit.entity.Witch;
import org.bukkit.entity.Wither;
import org.bukkit.entity.Wolf;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.metadata.Metadatable;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.projectiles.ProjectileSource;


public interface LivingEntity extends Entity, Damageable, ProjectileSource  {


	double getEyeHeight();

	double getEyeHeight(boolean ignoreSneaking);

	Location getEyeLocation();

	@Deprecated List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance);

	@Deprecated Block getTargetBlock(HashSet<Byte> transparent, int maxDistance);

	@Deprecated List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent, int maxDistance);

	@Deprecated Egg throwEgg();

	@Deprecated Snowball throwSnowball();

	@Deprecated Arrow shootArrow();

	int getRemainingAir();

	void setRemainingAir(int ticks);

	int getMaximumAir();

	void setMaximumAir(int ticks);

	int getMaximumNoDamageTicks();

	void setMaximumNoDamageTicks(int ticks);

	double getLastDamage();

	@Deprecated int _INVALID_getLastDamage();

	void setLastDamage(double damage);

	@Deprecated void _INVALID_setLastDamage(int damage);

	int getNoDamageTicks();

	void setNoDamageTicks(int ticks);

	Player getKiller();

	boolean addPotionEffect(PotionEffect effect);

	boolean addPotionEffect(PotionEffect effect, boolean force);

	boolean addPotionEffects(Collection<PotionEffect> effects);

	boolean hasPotionEffect(PotionEffectType type);

	void removePotionEffect(PotionEffectType type);

	Collection<PotionEffect> getActivePotionEffects();

	boolean hasLineOfSight(Entity other);

	boolean getRemoveWhenFarAway();

	void setRemoveWhenFarAway(boolean remove);

	EntityEquipment getEquipment();

	void setCanPickupItems(boolean pickup);

	boolean getCanPickupItems();

	void setCustomName(String name);

	String getCustomName();

	void setCustomNameVisible(boolean flag);

	boolean isCustomNameVisible();

	boolean isLeashed();

	Entity getLeashHolder() throws IllegalStateException;

	boolean setLeashHolder(Entity holder);
}
