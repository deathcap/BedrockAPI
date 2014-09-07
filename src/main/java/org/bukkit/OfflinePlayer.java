package org.bukkit;

import java.util.UUID;
import org.bukkit.Location;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.entity.AnimalTamer;
import org.bukkit.entity.Player;
import org.bukkit.permissions.ServerOperator;


public interface OfflinePlayer extends ServerOperator, AnimalTamer, ConfigurationSerializable  {


	boolean isOnline();

	String getName();

	UUID getUniqueId();

	boolean isBanned();

	@Deprecated void setBanned(boolean banned);

	boolean isWhitelisted();

	void setWhitelisted(boolean value);

	Player getPlayer();

	long getFirstPlayed();

	long getLastPlayed();

	boolean hasPlayedBefore();

	Location getBedSpawnLocation();
}
