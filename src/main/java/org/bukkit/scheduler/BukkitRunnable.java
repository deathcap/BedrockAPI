package org.bukkit.scheduler;

import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitTask;


public abstract class BukkitRunnable extends Object implements Runnable  {


	public BukkitRunnable() {
	}

	public void cancel() throws IllegalStateException {
	}

	public BukkitTask runTask(Plugin plugin) throws IllegalArgumentException, IllegalStateException {
		return null;
	}

	public BukkitTask runTaskAsynchronously(Plugin plugin) throws IllegalArgumentException, IllegalStateException {
		return null;
	}

	public BukkitTask runTaskLater(Plugin plugin, long delay) throws IllegalArgumentException, IllegalStateException {
		return null;
	}

	public BukkitTask runTaskLaterAsynchronously(Plugin plugin, long delay) throws IllegalArgumentException, IllegalStateException {
		return null;
	}

	public BukkitTask runTaskTimer(Plugin plugin, long delay, long period) throws IllegalArgumentException, IllegalStateException {
		return null;
	}

	public BukkitTask runTaskTimerAsynchronously(Plugin plugin, long delay, long period) throws IllegalArgumentException, IllegalStateException {
		return null;
	}

	public int getTaskId() throws IllegalStateException {
		return 0;
	}
}
