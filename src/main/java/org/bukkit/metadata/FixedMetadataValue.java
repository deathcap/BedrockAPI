package org.bukkit.metadata;

import org.bukkit.metadata.LazyMetadataValue;
import org.bukkit.metadata.LazyMetadataValue.CacheStrategy;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.metadata.MetadataValueAdapter;
import org.bukkit.plugin.Plugin;


public class FixedMetadataValue extends LazyMetadataValue  {


	public void invalidate() {
	}

	public Object value() {
		return null;
	}
}
