package com.pickyprince.flashCard.lib.View;

public class FlashCard {
	private String word;
	private String meaning;
	private boolean front_back;
	public FlashCard() {
		this("Type in words..", "Type meaning..", true);
	}
	public FlashCard(String word, String meaning, boolean front_back) {
		this.word = word;
		this.meaning = meaning;
		this.front_back = front_back;
	}
	public void onClickButton(){
		if (this.front_back == false) {
			this.front_back = true;
		}else {
			this.front_back=false;
		}
	}

}
