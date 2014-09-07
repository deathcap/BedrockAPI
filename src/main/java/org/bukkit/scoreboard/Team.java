package org.bukkit.scoreboard;

import java.util.Set;
import org.bukkit.OfflinePlayer;
import org.bukkit.scoreboard.Scoreboard;


public interface Team  {


	String getName() throws IllegalStateException;

	String getDisplayName() throws IllegalStateException;

	void setDisplayName(String displayName) throws IllegalStateException, IllegalArgumentException;

	String getPrefix() throws IllegalStateException;

	void setPrefix(String prefix) throws IllegalStateException, IllegalArgumentException;

	String getSuffix() throws IllegalStateException;

	void setSuffix(String suffix) throws IllegalStateException, IllegalArgumentException;

	boolean allowFriendlyFire() throws IllegalStateException;

	void setAllowFriendlyFire(boolean enabled) throws IllegalStateException;

	boolean canSeeFriendlyInvisibles() throws IllegalStateException;

	void setCanSeeFriendlyInvisibles(boolean enabled) throws IllegalStateException;

	Set<OfflinePlayer> getPlayers() throws IllegalStateException;

	int getSize() throws IllegalStateException;

	Scoreboard getScoreboard();

	void addPlayer(OfflinePlayer player) throws IllegalStateException, IllegalArgumentException;

	boolean removePlayer(OfflinePlayer player) throws IllegalStateException, IllegalArgumentException;

	void unregister() throws IllegalStateException;

	boolean hasPlayer(OfflinePlayer player) throws IllegalArgumentException, IllegalStateException;
}
