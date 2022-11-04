package com.mipresupuesto.personalbudget.controller.response.dto;

public class Message {
	
	private String text;
	private String level;
	private String title;
	private Message(String text, String level, String title) {
		setText(text);
		setLevel(level);
		setTitle(title);
	}
	private final void setText(final String text) {
		if (text == null || "".intern() == text.intern().trim()) { 
			this.text = "";
		}else {
		this.text = text.trim();
		}
	}
	private final void setLevel(final MessageLevel level) {
		if (level == null || "".intern() == level.intern().trim()) { 
			this.level = "";
		}else {
		this.level = level.trim();
		}
	}
	private final void setTitle(final String title) {
		if (title == null || "".intern() == title.intern().trim()) { 
			this.title = "";
		}else {
		this.title = title.trim();
		}
	}
	
	public final String getText() {
		
	
		
		return text;
	}
	public final String getLevel() {
		return level;
	}
	public final String getTitle() {
		return title;
	}

	
}
