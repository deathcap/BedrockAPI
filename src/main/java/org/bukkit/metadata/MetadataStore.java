package org.bukkit.metadata;

import java.util.List;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;


public interface MetadataStore<T>  {


	void setMetadata(T subject, String metadataKey, MetadataValue newMetadataValue);

	List<MetadataValue> getMetadata(T subject, String metadataKey);

	boolean hasMetadata(T subject, String metadataKey);

	void removeMetadata(T subject, String metadataKey, Plugin owningPlugin);

	void invalidateAll(Plugin owningPlugin);
}
