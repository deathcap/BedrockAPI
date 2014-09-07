package org.bukkit.metadata;

import java.util.List;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;


public abstract class MetadataStoreBase<T> extends Object  {


	public void setMetadata(T subject, String metadataKey, MetadataValue newMetadataValue) {
	}

	public List<MetadataValue> getMetadata(T subject, String metadataKey) {
		return null;
	}

	public boolean hasMetadata(T subject, String metadataKey) {
		return false;
	}

	public void removeMetadata(T subject, String metadataKey, Plugin owningPlugin) {
	}

	public void invalidateAll(Plugin owningPlugin) {
	}

	protected abstract String disambiguate(T subject, String metadataKey);
}
