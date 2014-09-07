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
import org.bukkit.Server;
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
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.util.CachedServerIcon;


public final class Bukkit extends Object  {


	public static Server getServer() {
		return null;
	}

	public static void setServer(Server server) {
	}

	public static String getName() {
		return null;
	}

	public static String getVersion() {
		return null;
	}

	public static String getBukkitVersion() {
		return null;
	}

	@Deprecated public static Player[] _INVALID_getOnlinePlayers() {
		return null;
	}

	public static Collection<? extends Player> getOnlinePlayers() {
		return null;
	}

	public static int getMaxPlayers() {
		return 0;
	}

	public static int getPort() {
		return 0;
	}

	public static int getViewDistance() {
		return 0;
	}

	public static String getIp() {
		return null;
	}

	public static String getServerName() {
		return null;
	}

	public static String getServerId() {
		return null;
	}

	public static String getWorldType() {
		return null;
	}

	public static boolean getGenerateStructures() {
		return false;
	}

	public static boolean getAllowNether() {
		return false;
	}

	public static boolean hasWhitelist() {
		return false;
	}

	public static int broadcastMessage(String message) {
		return 0;
	}

	public static String getUpdateFolder() {
		return null;
	}

	@Deprecated public static Player getPlayer(String name) {
		return null;
	}

	@Deprecated public static List<Player> matchPlayer(String name) {
		return null;
	}

	public static Player getPlayer(UUID id) {
		return null;
	}

	public static PluginManager getPluginManager() {
		return null;
	}

	public static BukkitScheduler getScheduler() {
		return null;
	}

	public static ServicesManager getServicesManager() {
		return null;
	}

	public static List<World> getWorlds() {
		return null;
	}

	public static World createWorld(WorldCreator options) {
		return null;
	}

	public static boolean unloadWorld(String name, boolean save) {
		return false;
	}

	public static boolean unloadWorld(World world, boolean save) {
		return false;
	}

	public static World getWorld(String name) {
		return null;
	}

	public static World getWorld(UUID uid) {
		return null;
	}

	@Deprecated public static MapView getMap(short id) {
		return null;
	}

	public static MapView createMap(World world) {
		return null;
	}

	public static void reload() {
	}

	public static Logger getLogger() {
		return null;
	}

	public static PluginCommand getPluginCommand(String name) {
		return null;
	}

	public static void savePlayers() {
	}

	public static boolean dispatchCommand(CommandSender sender, String commandLine) throws CommandException {
		return false;
	}

	public static void configureDbConfig(com.avaje.ebean.config.ServerConfig config) {
	}

	public static boolean addRecipe(Recipe recipe) {
		return false;
	}

	public static List<Recipe> getRecipesFor(ItemStack result) {
		return null;
	}

	public static Iterator<Recipe> recipeIterator() {
		return null;
	}

	public static void clearRecipes() {
	}

	public static void resetRecipes() {
	}

	public static Map<String,String[]> getCommandAliases() {
		return null;
	}

	public static int getSpawnRadius() {
		return 0;
	}

	public static void setSpawnRadius(int value) {
	}

	public static boolean getOnlineMode() {
		return false;
	}

	public static boolean getAllowFlight() {
		return false;
	}

	public static boolean isHardcore() {
		return false;
	}

	public static void shutdown() {
	}

	public static int broadcast(String message, String permission) {
		return 0;
	}

	@Deprecated public static OfflinePlayer getOfflinePlayer(String name) {
		return null;
	}

	public static OfflinePlayer getOfflinePlayer(UUID id) {
		return null;
	}

	@Deprecated public static Player getPlayerExact(String name) {
		return null;
	}

	public static Set<String> getIPBans() {
		return null;
	}

	public static void banIP(String address) {
	}

	public static void unbanIP(String address) {
	}

	public static Set<OfflinePlayer> getBannedPlayers() {
		return null;
	}

	public static BanList getBanList(BanList.Type type) {
		return null;
	}

	public static void setWhitelist(boolean value) {
	}

	public static Set<OfflinePlayer> getWhitelistedPlayers() {
		return null;
	}

	public static void reloadWhitelist() {
	}

	public static ConsoleCommandSender getConsoleSender() {
		return null;
	}

	public static Set<OfflinePlayer> getOperators() {
		return null;
	}

	public static File getWorldContainer() {
		return null;
	}

	public static Messenger getMessenger() {
		return null;
	}

	public static boolean getAllowEnd() {
		return false;
	}

	public static File getUpdateFolderFile() {
		return null;
	}

	public static long getConnectionThrottle() {
		return 0;
	}

	public static int getTicksPerAnimalSpawns() {
		return 0;
	}

	public static int getTicksPerMonsterSpawns() {
		return 0;
	}

	public static boolean useExactLoginLocation() {
		return false;
	}

	public static GameMode getDefaultGameMode() {
		return null;
	}

	public static void setDefaultGameMode(GameMode mode) {
	}

	public static OfflinePlayer[] getOfflinePlayers() {
		return null;
	}

	public static Inventory createInventory(InventoryHolder owner, InventoryType type) {
		return null;
	}

	public static Inventory createInventory(InventoryHolder owner, InventoryType type, String title) {
		return null;
	}

	public static Inventory createInventory(InventoryHolder owner, int size) throws IllegalArgumentException {
		return null;
	}

	public static Inventory createInventory(InventoryHolder owner, int size, String title) throws IllegalArgumentException {
		return null;
	}

	public static HelpMap getHelpMap() {
		return null;
	}

	public static int getMonsterSpawnLimit() {
		return 0;
	}

	public static int getAnimalSpawnLimit() {
		return 0;
	}

	public static int getWaterAnimalSpawnLimit() {
		return 0;
	}

	public static int getAmbientSpawnLimit() {
		return 0;
	}

	public static boolean isPrimaryThread() {
		return false;
	}

	public static String getMotd() {
		return null;
	}

	public static String getShutdownMessage() {
		return null;
	}

	public static Warning.WarningState getWarningState() {
		return null;
	}

	public static ItemFactory getItemFactory() {
		return null;
	}

	public static ScoreboardManager getScoreboardManager() {
		return null;
	}

	public static CachedServerIcon getServerIcon() {
		return null;
	}

	public static CachedServerIcon loadServerIcon(File file) throws IllegalArgumentException, Exception {
		return null;
	}

	public static CachedServerIcon loadServerIcon(BufferedImage image) throws IllegalArgumentException, Exception {
		return null;
	}

	public static void setIdleTimeout(int threshold) {
	}

	public static int getIdleTimeout() {
		return 0;
	}

	@Deprecated public static UnsafeValues getUnsafe() {
		return null;
	}
}
