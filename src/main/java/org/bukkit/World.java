package org.bukkit;

import java.io.Serializable;
import org.bukkit.World;
import org.bukkit.World.Environment;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.bukkit.BlockChangeDelegate;
import org.bukkit.Chunk;
import org.bukkit.ChunkSnapshot;
import org.bukkit.Difficulty;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.TreeType;
import org.bukkit.World.Environment;
import org.bukkit.WorldType;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.CreatureType;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.Item;
import org.bukkit.entity.LightningStrike;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.Metadatable;
import org.bukkit.plugin.messaging.PluginMessageRecipient;
import org.bukkit.util.Vector;


public interface World extends PluginMessageRecipient, Metadatable  {


	Block getBlockAt(int x, int y, int z);

	Block getBlockAt(Location location);

	@Deprecated int getBlockTypeIdAt(int x, int y, int z);

	@Deprecated int getBlockTypeIdAt(Location location);

	int getHighestBlockYAt(int x, int z);

	int getHighestBlockYAt(Location location);

	Block getHighestBlockAt(int x, int z);

	Block getHighestBlockAt(Location location);

	Chunk getChunkAt(int x, int z);

	Chunk getChunkAt(Location location);

	Chunk getChunkAt(Block block);

	boolean isChunkLoaded(Chunk chunk);

	Chunk[] getLoadedChunks();

	void loadChunk(Chunk chunk);

	boolean isChunkLoaded(int x, int z);

	boolean isChunkInUse(int x, int z);

	void loadChunk(int x, int z);

	boolean loadChunk(int x, int z, boolean generate);

	boolean unloadChunk(Chunk chunk);

	boolean unloadChunk(int x, int z);

	boolean unloadChunk(int x, int z, boolean save);

	boolean unloadChunk(int x, int z, boolean save, boolean safe);

	boolean unloadChunkRequest(int x, int z);

	boolean unloadChunkRequest(int x, int z, boolean safe);

	boolean regenerateChunk(int x, int z);

	boolean refreshChunk(int x, int z);

	Item dropItem(Location location, ItemStack item);

	Item dropItemNaturally(Location location, ItemStack item);

	Arrow spawnArrow(Location location, Vector direction, float speed, float spread);

	boolean generateTree(Location location, TreeType type);

	boolean generateTree(Location loc, TreeType type, BlockChangeDelegate delegate);

	Entity spawnEntity(Location loc, EntityType type);

	@Deprecated LivingEntity spawnCreature(Location loc, EntityType type);

	@Deprecated LivingEntity spawnCreature(Location loc, CreatureType type);

	LightningStrike strikeLightning(Location loc);

	LightningStrike strikeLightningEffect(Location loc);

	List<Entity> getEntities();

	List<LivingEntity> getLivingEntities();

	@Deprecated <T extends Entity> Collection<T> getEntitiesByClass(Class<T>... classes);

	<T extends Entity> Collection<T> getEntitiesByClass(Class<T> cls);

	Collection<Entity> getEntitiesByClasses(Class<?>... classes);

	List<Player> getPlayers();

	String getName();

	UUID getUID();

	Location getSpawnLocation();

	boolean setSpawnLocation(int x, int y, int z);

	long getTime();

	void setTime(long time);

	long getFullTime();

	void setFullTime(long time);

	boolean hasStorm();

	void setStorm(boolean hasStorm);

	int getWeatherDuration();

	void setWeatherDuration(int duration);

	boolean isThundering();

	void setThundering(boolean thundering);

	int getThunderDuration();

	void setThunderDuration(int duration);

	boolean createExplosion(double x, double y, double z, float power);

	boolean createExplosion(double x, double y, double z, float power, boolean setFire);

	boolean createExplosion(double x, double y, double z, float power, boolean setFire, boolean breakBlocks);

	boolean createExplosion(Location loc, float power);

	boolean createExplosion(Location loc, float power, boolean setFire);

	World.Environment getEnvironment();

	long getSeed();

	boolean getPVP();

	void setPVP(boolean pvp);

	ChunkGenerator getGenerator();

	void save();

	List<BlockPopulator> getPopulators();

	<T extends Entity> T spawn(Location location, Class<T> clazz) throws IllegalArgumentException;

	@Deprecated FallingBlock spawnFallingBlock(Location location, Material material, byte data) throws IllegalArgumentException;

	@Deprecated FallingBlock spawnFallingBlock(Location location, int blockId, byte blockData) throws IllegalArgumentException;

	void playEffect(Location location, Effect effect, int data);

	void playEffect(Location location, Effect effect, int data, int radius);

	<T> void playEffect(Location location, Effect effect, T data);

	<T> void playEffect(Location location, Effect effect, T data, int radius);

	ChunkSnapshot getEmptyChunkSnapshot(int x, int z, boolean includeBiome, boolean includeBiomeTempRain);

	void setSpawnFlags(boolean allowMonsters, boolean allowAnimals);

	boolean getAllowAnimals();

	boolean getAllowMonsters();

	Biome getBiome(int x, int z);

	void setBiome(int x, int z, Biome bio);

	double getTemperature(int x, int z);

	double getHumidity(int x, int z);

	int getMaxHeight();

	int getSeaLevel();

	boolean getKeepSpawnInMemory();

	void setKeepSpawnInMemory(boolean keepLoaded);

	boolean isAutoSave();

	void setAutoSave(boolean value);

	void setDifficulty(Difficulty difficulty);

	Difficulty getDifficulty();

	File getWorldFolder();

	WorldType getWorldType();

	boolean canGenerateStructures();

	long getTicksPerAnimalSpawns();

	void setTicksPerAnimalSpawns(int ticksPerAnimalSpawns);

	long getTicksPerMonsterSpawns();

	void setTicksPerMonsterSpawns(int ticksPerMonsterSpawns);

	int getMonsterSpawnLimit();

	void setMonsterSpawnLimit(int limit);

	int getAnimalSpawnLimit();

	void setAnimalSpawnLimit(int limit);

	int getWaterAnimalSpawnLimit();

	void setWaterAnimalSpawnLimit(int limit);

	int getAmbientSpawnLimit();

	void setAmbientSpawnLimit(int limit);

	void playSound(Location location, Sound sound, float volume, float pitch);

	String[] getGameRules();

	String getGameRuleValue(String rule);

	boolean setGameRuleValue(String rule, String value);

	boolean isGameRule(String rule);

	
	
	
	public static enum Environment  {
	
		NORMAL,
		NETHER,
		THE_END,
		;
	
		@Deprecated public int getId() {
			return 0;
		}
	
		@Deprecated public static Environment getEnvironment(int id) {
			return null;
		}
	}
}
