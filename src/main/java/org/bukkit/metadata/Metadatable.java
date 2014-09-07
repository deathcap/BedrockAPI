package org.bukkit.metadata;

import java.util.List;
import org.bukkit.plugin.Plugin;


public interface Metadatable  {


	void setMetadata(String metadataKey, MetadataValue newMetadataValue);

	List<MetadataValue> getMetadata(String metadataKey);

	boolean hasMetadata(String metadataKey);

	void removeMetadata(String metadataKey, Plugin owningPlugin);
}
