package org.bukkit;

import java.io.Serializable;
import org.bukkit.BanList;
import org.bukkit.BanList.Type;
import java.util.Date;
import java.util.Set;
import org.bukkit.BanEntry;
import org.bukkit.BanList.Type;


public interface BanList  {


	BanEntry getBanEntry(String target);

	BanEntry addBan(String target, String reason, Date expires, String source);

	Set<BanEntry> getBanEntries();

	boolean isBanned(String target);

	void pardon(String target);

	
	
	
	public static enum Type  {
	
		NAME,
		IP,
		;
	}
}
