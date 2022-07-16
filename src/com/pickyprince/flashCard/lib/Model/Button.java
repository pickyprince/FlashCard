package com.pickyprince.flashCard.lib.Model;

public class Button {
	private String title;
	private String description;
	
	private OnClickListener onClickListener;
	public Button(String title, OnClickListener listener) {
		this.onClickListener = listener;
		this.title = title;
		this.description = "No description";
	}
	public void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTtitle(String title) {
		return this.title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public OnClickListener getOnClickListener() {
		return this.onClickListener;
	}
	@Override
	public String toString() {
		return "Button_" + title + ":  "+ description;
	}
	
	
}
