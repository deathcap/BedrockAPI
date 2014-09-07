package org.bukkit.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.player.PlayerChannelEvent;
import org.bukkit.event.player.PlayerEvent;


public class PlayerRegisterChannelEvent extends PlayerChannelEvent  {


	public PlayerRegisterChannelEvent(Player player, String channel) {
        super(player, channel);
	}
}
