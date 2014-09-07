package org.bukkit.metadata;

import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.metadata.LazyMetadataValue;
import org.bukkit.metadata.MetadataValueAdapter;
import org.bukkit.plugin.Plugin;


public interface MetadataValue  {


	Object value();

	int asInt();

	float asFloat();

	double asDouble();

	long asLong();

	short asShort();

	byte asByte();

	boolean asBoolean();

	String asString();

	Plugin getOwningPlugin();

	void invalidate();
}
