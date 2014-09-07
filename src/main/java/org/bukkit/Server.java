package org.bukkit;

import com.avaje.ebean.config.ServerConfig;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Logger;
import org.bukkit.BanList;
import org.bukkit.BanList.Type;
import org.bukkit.GameMode;
import org.bukkit.OfflinePlayer;
import org.bukkit.UnsafeValues;
import org.bukkit.Warning.WarningState;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.help.HelpMap;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemFactory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.map.MapView;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.ServicesManager;
import org.bukkit.plugin.messaging.Messenger;
import org.bukkit.plugin.messaging.PluginMessageRecipient;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.util.CachedServerIcon;


public interface Server extends PluginMessageRecipient  {


	String getName();

	String getVersion();

	String getBukkitVersion();

	@Deprecated Player[] _INVALID_getOnlinePlayers();

	Collection<? extends Player> getOnlinePlayers();

	int getMaxPlayers();

	int getPort();

	int getViewDistance();

	String getIp();

	String getServerName();

	String getServerId();

	String getWorldType();

	boolean getGenerateStructures();

	boolean getAllowEnd();

	boolean getAllowNether();

	boolean hasWhitelist();

	void setWhitelist(boolean value);

	Set<OfflinePlayer> getWhitelistedPlayers();

	void reloadWhitelist();

	int broadcastMessage(String message);

	String getUpdateFolder();

	File getUpdateFolderFile();

	long getConnectionThrottle();

	int getTicksPerAnimalSpawns();

	int getTicksPerMonsterSpawns();

	@Deprecated Player getPlayer(String name);

	@Deprecated Player getPlayerExact(String name);

	@Deprecated List<Player> matchPlayer(String name);

	Player getPlayer(UUID id);

	PluginManager getPluginManager();

	BukkitScheduler getScheduler();

	ServicesManager getServicesManager();

	List<World> getWorlds();

	World createWorld(WorldCreator creator);

	boolean unloadWorld(String name, boolean save);

	boolean unloadWorld(World world, boolean save);

	World getWorld(String name);

	World getWorld(UUID uid);

	@Deprecated MapView getMap(short id);

	MapView createMap(World world);

	void reload();

	Logger getLogger();

	PluginCommand getPluginCommand(String name);

	void savePlayers();

	boolean dispatchCommand(CommandSender sender, String commandLine) throws CommandException;

	void configureDbConfig(com.avaje.ebean.config.ServerConfig config);

	boolean addRecipe(Recipe recipe);

	List<Recipe> getRecipesFor(ItemStack result);

	Iterator<Recipe> recipeIterator();

	void clearRecipes();

	void resetRecipes();

	Map<String,String[]> getCommandAliases();

	int getSpawnRadius();

	void setSpawnRadius(int value);

	boolean getOnlineMode();

	boolean getAllowFlight();

	boolean isHardcore();

	boolean useExactLoginLocation();

	void shutdown();

	int broadcast(String message, String permission);

	@Deprecated OfflinePlayer getOfflinePlayer(String name);

	OfflinePlayer getOfflinePlayer(UUID id);

	Set<String> getIPBans();

	void banIP(String address);

	void unbanIP(String address);

	Set<OfflinePlayer> getBannedPlayers();

	BanList getBanList(BanList.Type type);

	Set<OfflinePlayer> getOperators();

	GameMode getDefaultGameMode();

	void setDefaultGameMode(GameMode mode);

	ConsoleCommandSender getConsoleSender();

	File getWorldContainer();

	OfflinePlayer[] getOfflinePlayers();

	Messenger getMessenger();

	HelpMap getHelpMap();

	Inventory createInventory(InventoryHolder owner, InventoryType type);

	Inventory createInventory(InventoryHolder owner, InventoryType type, String title);

	Inventory createInventory(InventoryHolder owner, int size) throws IllegalArgumentException;

	Inventory createInventory(InventoryHolder owner, int size, String title) throws IllegalArgumentException;

	int getMonsterSpawnLimit();

	int getAnimalSpawnLimit();

	int getWaterAnimalSpawnLimit();

	int getAmbientSpawnLimit();

	boolean isPrimaryThread();

	String getMotd();

	String getShutdownMessage();

	Warning.WarningState getWarningState();

	ItemFactory getItemFactory();

	ScoreboardManager getScoreboardManager();

	CachedServerIcon getServerIcon();

	CachedServerIcon loadServerIcon(File file) throws IllegalArgumentException, Exception;

	CachedServerIcon loadServerIcon(BufferedImage image) throws IllegalArgumentException, Exception;

	void setIdleTimeout(int threshold);

	int getIdleTimeout();

	@Deprecated UnsafeValues getUnsafe();
}
