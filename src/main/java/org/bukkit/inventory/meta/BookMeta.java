package org.bukkit.inventory.meta;

import java.util.List;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;


public interface BookMeta extends ItemMeta  {


	boolean hasTitle();

	String getTitle();

	boolean setTitle(String title);

	boolean hasAuthor();

	String getAuthor();

	void setAuthor(String author);

	boolean hasPages();

	String getPage(int page);

	void setPage(int page, String data);

	List<String> getPages();

	void setPages(List<String> pages);

	void setPages(String... pages);

	void addPage(String... pages);

	int getPageCount();

	BookMeta clone();
}
