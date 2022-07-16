package com.pickyprince.flashCard.lib;

import com.pickyprince.flashCard.lib.Model.Button;
import com.pickyprince.flashCard.lib.Model.OnClickListener;
import com.pickyprince.flashCard.lib.View.Home;

public class Main {
	public static void main(String[] args) {
		
		String curDisplay = "Home";
		
		OnClickListener listener = new OnClickListener() {
			public void onClick() {
				System.out.println("the button is clicked");
			}
		};
		Home home = new Home();
		Button b1 = new Button("IMPORT", listener);
		b1.setDescription("Click this button to import CSV file.");
		home.addButton(b1);
		home.printHome();
		
	}
}
