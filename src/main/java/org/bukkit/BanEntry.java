package org.bukkit;

import java.util.Date;


public interface BanEntry  {


	String getTarget();

	Date getCreated();

	void setCreated(Date created);

	String getSource();

	void setSource(String source);

	Date getExpiration();

	void setExpiration(Date expiration);

	String getReason();

	void setReason(String reason);

	void save();
}
