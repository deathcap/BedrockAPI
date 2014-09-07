package org.bukkit.scoreboard;

import org.bukkit.OfflinePlayer;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;


public interface Score  {


	@Deprecated OfflinePlayer getPlayer();

	String getEntry();

	Objective getObjective();

	int getScore() throws IllegalStateException;

	void setScore(int score) throws IllegalStateException;

	Scoreboard getScoreboard();
}
