package org.bukkit.util;

import org.bukkit.util.ChatPaginator;
import org.bukkit.util.ChatPaginator.ChatPage;


public class ChatPaginator extends Object  {


	public static final int GUARANTEED_NO_WRAP_CHAT_PAGE_WIDTH = 0;

	public static final int AVERAGE_CHAT_PAGE_WIDTH = 0;

	public static final int UNBOUNDED_PAGE_WIDTH = 0;

	public static final int OPEN_CHAT_PAGE_HEIGHT = 0;

	public static final int CLOSED_CHAT_PAGE_HEIGHT = 0;

	public static final int UNBOUNDED_PAGE_HEIGHT = 0;

	public ChatPaginator() {
	}

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
	
	
		public ChatPage(String[] lines, int pageNumber, int totalPages) {
		}
	
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
