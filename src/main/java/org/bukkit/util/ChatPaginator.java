package org.bukkit.util;

import org.bukkit.util.ChatPaginator;
import org.bukkit.util.ChatPaginator.ChatPage;


public class ChatPaginator extends Object  {


	public static ChatPaginator.ChatPage paginate(String unpaginatedString, int pageNumber) {
		return null;
	}

	public static ChatPaginator.ChatPage paginate(String unpaginatedString, int pageNumber, int lineLength, int pageHeight) {
		return null;
	}

	public static String[] wordWrap(String rawString, int lineLength) {
		return null;
	}

	
	
	
	public static class ChatPage extends Object  {
	
	
		public int getPageNumber() {
			return 0;
		}
	
		public int getTotalPages() {
			return 0;
		}
	
		public String[] getLines() {
			return null;
		}
	}
}
