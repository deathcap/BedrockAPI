package org.bukkit;

import java.util.List;
import org.bukkit.Achievement;
import org.bukkit.Material;
import org.bukkit.Statistic;
import org.bukkit.inventory.ItemStack;


@Deprecated public interface UnsafeValues  {


	Material getMaterialFromInternalName(String name);

	List<String> tabCompleteInternalMaterialName(String token, List<String> completions);

	ItemStack modifyItemStack(ItemStack stack, String arguments);

	Statistic getStatisticFromInternalName(String name);

	Achievement getAchievementFromInternalName(String name);

	List<String> tabCompleteInternalStatisticOrAchievementName(String token, List<String> completions);
}
