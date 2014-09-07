package org.bukkit.event.block;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.BlockEvent;


public class SignChangeEvent extends BlockEvent implements Cancellable  {


	public SignChangeEvent(Block theBlock, Player thePlayer, String[] theLines) {
	}

	public Player getPlayer() {
		return null;
	}

	public String[] getLines() {
		return null;
	}

	public String getLine(int index) throws IndexOutOfBoundsException {
		return null;
	}

	public void setLine(int index, String line) throws IndexOutOfBoundsException {
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancel) {
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}
}
