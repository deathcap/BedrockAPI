package org.bukkit.metadata;

import org.bukkit.metadata.LazyMetadataValue;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;


public abstract class MetadataValueAdapter extends Object implements MetadataValue  {


	protected final WeakReference<Plugin> owningPlugin = null;

	protected MetadataValueAdapter(Plugin owningPlugin) {
	}

	public Plugin getOwningPlugin() {
		return null;
	}

	public int asInt() {
		return 0;
	}

	public float asFloat() {
		return 0.0f;
	}

	public double asDouble() {
		return 0.0;
	}

	public long asLong() {
		return 0;
	}

	public short asShort() {
		return 0;
	}

	public byte asByte() {
		return 0;
	}

	public boolean asBoolean() {
		return false;
	}

	public String asString() {
		return null;
	}
}
