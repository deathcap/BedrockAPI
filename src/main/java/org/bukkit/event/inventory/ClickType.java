package org.bukkit.event.inventory;

import java.io.Serializable;
import org.bukkit.event.inventory.ClickType;


public enum ClickType  {

	LEFT,
	SHIFT_LEFT,
	RIGHT,
	SHIFT_RIGHT,
	WINDOW_BORDER_LEFT,
	WINDOW_BORDER_RIGHT,
	MIDDLE,
	NUMBER_KEY,
	DOUBLE_CLICK,
	DROP,
	CONTROL_DROP,
	CREATIVE,
	UNKNOWN,
	;



	public boolean isKeyboardClick() {
		return false;
	}

	public boolean isCreativeAction() {
		return false;
	}

	public boolean isRightClick() {
		return false;
	}

	public boolean isLeftClick() {
		return false;
	}

	public boolean isShiftClick() {
		return false;
	}
}
