package org.bukkit.potion;

import java.io.Serializable;
import org.bukkit.potion.Potion;
import org.bukkit.potion.Potion.Tier;
import java.util.Collection;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.Potion;
import org.bukkit.potion.Potion.Tier;
import org.bukkit.potion.PotionBrewer;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionType;


public class Potion extends Object  {


	public Potion(PotionType type) {
	}

	@Deprecated public Potion(PotionType type, Potion.Tier tier) {
	}

	@Deprecated public Potion(PotionType type, Potion.Tier tier, boolean splash) {
	}

	@Deprecated public Potion(PotionType type, Potion.Tier tier, boolean splash, boolean extended) {
	}

	public Potion(PotionType type, int level) {
	}

	@Deprecated public Potion(PotionType type, int level, boolean splash) {
	}

	@Deprecated public Potion(PotionType type, int level, boolean splash, boolean extended) {
	}

	public Potion(int name) {
	}

	public Potion splash() {
		return null;
	}

	public Potion extend() {
		return null;
	}

	public void apply(ItemStack to) {
	}

	public void apply(LivingEntity to) {
	}

	public boolean equals(Object obj) {
		return false;
	}

	public Collection<PotionEffect> getEffects() {
		return null;
	}

	public int getLevel() {
		return 0;
	}

	@Deprecated public Potion.Tier getTier() {
		return null;
	}

	public PotionType getType() {
		return null;
	}

	public boolean hasExtendedDuration() {
		return false;
	}

	public int hashCode() {
		return 0;
	}

	public boolean isSplash() {
		return false;
	}

	public void setHasExtendedDuration(boolean isExtended) {
	}

	public void setSplash(boolean isSplash) {
	}

	@Deprecated public void setTier(Potion.Tier tier) {
	}

	public void setType(PotionType type) {
	}

	public void setLevel(int level) {
	}

	@Deprecated public short toDamageValue() {
		return 0;
	}

	public ItemStack toItemStack(int amount) {
		return null;
	}

	@Deprecated public static Potion fromDamage(int damage) {
		return null;
	}

	public static Potion fromItemStack(ItemStack item) {
		return null;
	}

	public static PotionBrewer getBrewer() {
		return null;
	}

	public static void setPotionBrewer(PotionBrewer other) {
	}

	@Deprecated public int getNameId() {
		return 0;
	}

	
	
	
	@Deprecated public static enum Tier  {
	
		ONE,
		TWO,
		;
	
		public int getDamageBit() {
			return 0;
		}
	
		public static Tier getByDamageBit(int damageBit) {
			return null;
		}
	}
}
