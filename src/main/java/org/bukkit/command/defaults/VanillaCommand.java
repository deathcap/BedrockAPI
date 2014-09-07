package org.bukkit.command.defaults;

import java.util.List;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.AchievementCommand;
import org.bukkit.command.defaults.BanCommand;
import org.bukkit.command.defaults.BanIpCommand;
import org.bukkit.command.defaults.BanListCommand;
import org.bukkit.command.defaults.ClearCommand;
import org.bukkit.command.defaults.DefaultGameModeCommand;
import org.bukkit.command.defaults.DeopCommand;
import org.bukkit.command.defaults.DifficultyCommand;
import org.bukkit.command.defaults.EffectCommand;
import org.bukkit.command.defaults.EnchantCommand;
import org.bukkit.command.defaults.ExpCommand;
import org.bukkit.command.defaults.GameModeCommand;
import org.bukkit.command.defaults.GameRuleCommand;
import org.bukkit.command.defaults.GiveCommand;
import org.bukkit.command.defaults.HelpCommand;
import org.bukkit.command.defaults.KickCommand;
import org.bukkit.command.defaults.KillCommand;
import org.bukkit.command.defaults.ListCommand;
import org.bukkit.command.defaults.MeCommand;
import org.bukkit.command.defaults.OpCommand;
import org.bukkit.command.defaults.PardonCommand;
import org.bukkit.command.defaults.PardonIpCommand;
import org.bukkit.command.defaults.PlaySoundCommand;
import org.bukkit.command.defaults.SaveCommand;
import org.bukkit.command.defaults.SaveOffCommand;
import org.bukkit.command.defaults.SaveOnCommand;
import org.bukkit.command.defaults.SayCommand;
import org.bukkit.command.defaults.ScoreboardCommand;
import org.bukkit.command.defaults.SeedCommand;
import org.bukkit.command.defaults.SetIdleTimeoutCommand;
import org.bukkit.command.defaults.SetWorldSpawnCommand;
import org.bukkit.command.defaults.SpawnpointCommand;
import org.bukkit.command.defaults.SpreadPlayersCommand;
import org.bukkit.command.defaults.StopCommand;
import org.bukkit.command.defaults.TeleportCommand;
import org.bukkit.command.defaults.TellCommand;
import org.bukkit.command.defaults.TestForCommand;
import org.bukkit.command.defaults.TimeCommand;
import org.bukkit.command.defaults.ToggleDownfallCommand;
import org.bukkit.command.defaults.WeatherCommand;
import org.bukkit.command.defaults.WhitelistCommand;


public abstract class VanillaCommand extends Command  {


	public boolean matches(String input) {
		return false;
	}

	protected int getInteger(CommandSender sender, String value, int min) {
		return 0;
	}

	public static double getRelativeDouble(double original, CommandSender sender, String input) {
		return 0.0;
	}

	public static double getDouble(CommandSender sender, String input) {
		return 0.0;
	}

	public static double getDouble(CommandSender sender, String input, double min, double max) {
		return 0.0;
	}
}
