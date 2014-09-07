package org.bukkit.scheduler;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;
import org.bukkit.scheduler.BukkitWorker;


public interface BukkitScheduler  {


	int scheduleSyncDelayedTask(Plugin plugin, Runnable task, long delay);

	@Deprecated int scheduleSyncDelayedTask(Plugin plugin, BukkitRunnable task, long delay);

	int scheduleSyncDelayedTask(Plugin plugin, Runnable task);

	@Deprecated int scheduleSyncDelayedTask(Plugin plugin, BukkitRunnable task);

	int scheduleSyncRepeatingTask(Plugin plugin, Runnable task, long delay, long period);

	@Deprecated int scheduleSyncRepeatingTask(Plugin plugin, BukkitRunnable task, long delay, long period);

	@Deprecated int scheduleAsyncDelayedTask(Plugin plugin, Runnable task, long delay);

	@Deprecated int scheduleAsyncDelayedTask(Plugin plugin, Runnable task);

	@Deprecated int scheduleAsyncRepeatingTask(Plugin plugin, Runnable task, long delay, long period);

	<T> Future<T> callSyncMethod(Plugin plugin, Callable<T> task);

	void cancelTask(int taskId);

	void cancelTasks(Plugin plugin);

	void cancelAllTasks();

	boolean isCurrentlyRunning(int taskId);

	boolean isQueued(int taskId);

	List<BukkitWorker> getActiveWorkers();

	List<BukkitTask> getPendingTasks();

	BukkitTask runTask(Plugin plugin, Runnable task) throws IllegalArgumentException;

	@Deprecated BukkitTask runTask(Plugin plugin, BukkitRunnable task) throws IllegalArgumentException;

	BukkitTask runTaskAsynchronously(Plugin plugin, Runnable task) throws IllegalArgumentException;

	@Deprecated BukkitTask runTaskAsynchronously(Plugin plugin, BukkitRunnable task) throws IllegalArgumentException;

	BukkitTask runTaskLater(Plugin plugin, Runnable task, long delay) throws IllegalArgumentException;

	@Deprecated BukkitTask runTaskLater(Plugin plugin, BukkitRunnable task, long delay) throws IllegalArgumentException;

	BukkitTask runTaskLaterAsynchronously(Plugin plugin, Runnable task, long delay) throws IllegalArgumentException;

	@Deprecated BukkitTask runTaskLaterAsynchronously(Plugin plugin, BukkitRunnable task, long delay) throws IllegalArgumentException;

	BukkitTask runTaskTimer(Plugin plugin, Runnable task, long delay, long period) throws IllegalArgumentException;

	@Deprecated BukkitTask runTaskTimer(Plugin plugin, BukkitRunnable task, long delay, long period) throws IllegalArgumentException;

	BukkitTask runTaskTimerAsynchronously(Plugin plugin, Runnable task, long delay, long period) throws IllegalArgumentException;

	@Deprecated BukkitTask runTaskTimerAsynchronously(Plugin plugin, BukkitRunnable task, long delay, long period) throws IllegalArgumentException;
}
