package org.bukkit.metadata;

import java.io.Serializable;
import org.bukkit.metadata.LazyMetadataValue;
import org.bukkit.metadata.LazyMetadataValue.CacheStrategy;
import java.util.concurrent.Callable;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.metadata.LazyMetadataValue.CacheStrategy;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.metadata.MetadataValueAdapter;
import org.bukkit.plugin.Plugin;


public class LazyMetadataValue extends MetadataValueAdapter implements MetadataValue  {


	public LazyMetadataValue(Plugin owningPlugin, Callable<Object> lazyValue) {
        super(owningPlugin);
	}

	public LazyMetadataValue(Plugin owningPlugin, LazyMetadataValue.CacheStrategy cacheStrategy, Callable<Object> lazyValue) {
        super(owningPlugin);
	}

	protected LazyMetadataValue(Plugin owningPlugin) {
        super(owningPlugin);
	}

	public Object value() {
		return null;
	}

	public void invalidate() {
	}

	
	
	
	public static enum CacheStrategy  {
	
		CACHE_AFTER_FIRST_EVAL,
		NEVER_CACHE,
		CACHE_ETERNALLY,
		;
	}
}
