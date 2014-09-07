package org.bukkit.entity;

import java.net.InetSocketAddress;
import org.bukkit.Achievement;
import org.bukkit.Effect;
import org.bukkit.Instrument;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Note;
import org.bukkit.OfflinePlayer;
import org.bukkit.Sound;
import org.bukkit.Statistic;
import org.bukkit.WeatherType;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.conversations.Conversable;
import org.bukkit.entity.AnimalTamer;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.map.MapView;
import org.bukkit.metadata.Metadatable;
import org.bukkit.permissions.Permissible;
import org.bukkit.permissions.ServerOperator;
import org.bukkit.plugin.messaging.PluginMessageRecipient;
import org.bukkit.projectiles.ProjectileSource;
import org.bukkit.scoreboard.Scoreboard;


public interface Player extends HumanEntity, Conversable, CommandSender, OfflinePlayer, PluginMessageRecipient  {


	String getDisplayName();

	void setDisplayName(String name);

	String getPlayerListName();

	void setPlayerListName(String name);

	void setCompassTarget(Location loc);

	Location getCompassTarget();

	InetSocketAddress getAddress();

	void sendRawMessage(String message);

	void kickPlayer(String message);

	void chat(String msg);

	boolean performCommand(String command);

	boolean isSneaking();

	void setSneaking(boolean sneak);

	boolean isSprinting();

	void setSprinting(boolean sprinting);

	void saveData();

	void loadData();

	void setSleepingIgnored(boolean isSleeping);

	boolean isSleepingIgnored();

	@Deprecated void playNote(Location loc, byte instrument, byte note);

	void playNote(Location loc, Instrument instrument, Note note);

	void playSound(Location location, Sound sound, float volume, float pitch);

	@Deprecated void playSound(Location location, String sound, float volume, float pitch);

	@Deprecated void playEffect(Location loc, Effect effect, int data);

	<T> void playEffect(Location loc, Effect effect, T data);

	@Deprecated void sendBlockChange(Location loc, Material material, byte data);

	@Deprecated boolean sendChunkChange(Location loc, int sx, int sy, int sz, byte[] data);

	@Deprecated void sendBlockChange(Location loc, int material, byte data);

	void sendSignChange(Location loc, String[] lines) throws IllegalArgumentException;

	void sendMap(MapView map);

	@Deprecated void updateInventory();

	void awardAchievement(Achievement achievement);

	void removeAchievement(Achievement achievement);

	boolean hasAchievement(Achievement achievement);

	void incrementStatistic(Statistic statistic) throws IllegalArgumentException;

	void decrementStatistic(Statistic statistic) throws IllegalArgumentException;

	void incrementStatistic(Statistic statistic, int amount) throws IllegalArgumentException;

	void decrementStatistic(Statistic statistic, int amount) throws IllegalArgumentException;

	void setStatistic(Statistic statistic, int newValue) throws IllegalArgumentException;

	int getStatistic(Statistic statistic) throws IllegalArgumentException;

	void incrementStatistic(Statistic statistic, Material material) throws IllegalArgumentException;

	void decrementStatistic(Statistic statistic, Material material) throws IllegalArgumentException;

	int getStatistic(Statistic statistic, Material material) throws IllegalArgumentException;

	void incrementStatistic(Statistic statistic, Material material, int amount) throws IllegalArgumentException;

	void decrementStatistic(Statistic statistic, Material material, int amount) throws IllegalArgumentException;

	void setStatistic(Statistic statistic, Material material, int newValue) throws IllegalArgumentException;

	void incrementStatistic(Statistic statistic, EntityType entityType) throws IllegalArgumentException;

	void decrementStatistic(Statistic statistic, EntityType entityType) throws IllegalArgumentException;

	int getStatistic(Statistic statistic, EntityType entityType) throws IllegalArgumentException;

	void incrementStatistic(Statistic statistic, EntityType entityType, int amount) throws IllegalArgumentException;

	void decrementStatistic(Statistic statistic, EntityType entityType, int amount);

	void setStatistic(Statistic statistic, EntityType entityType, int newValue);

	void setPlayerTime(long time, boolean relative);

	long getPlayerTime();

	long getPlayerTimeOffset();

	boolean isPlayerTimeRelative();

	void resetPlayerTime();

	void setPlayerWeather(WeatherType type);

	WeatherType getPlayerWeather();

	void resetPlayerWeather();

	void giveExp(int amount);

	void giveExpLevels(int amount);

	float getExp();

	void setExp(float exp);

	int getLevel();

	void setLevel(int level);

	int getTotalExperience();

	void setTotalExperience(int exp);

	float getExhaustion();

	void setExhaustion(float value);

	float getSaturation();

	void setSaturation(float value);

	int getFoodLevel();

	void setFoodLevel(int value);

	Location getBedSpawnLocation();

	void setBedSpawnLocation(Location location);

	void setBedSpawnLocation(Location location, boolean force);

	boolean getAllowFlight();

	void setAllowFlight(boolean flight);

	void hidePlayer(Player player);

	void showPlayer(Player player);

	boolean canSee(Player player);

	@Deprecated boolean isOnGround();

	boolean isFlying();

	void setFlying(boolean value);

	void setFlySpeed(float value) throws IllegalArgumentException;

	void setWalkSpeed(float value) throws IllegalArgumentException;

	float getFlySpeed();

	float getWalkSpeed();

	@Deprecated void setTexturePack(String url);

	void setResourcePack(String url);

	Scoreboard getScoreboard();

	void setScoreboard(Scoreboard scoreboard) throws IllegalArgumentException, IllegalStateException;

	boolean isHealthScaled();

	void setHealthScaled(boolean scale);

	void setHealthScale(double scale) throws IllegalArgumentException;

	double getHealthScale();
}
