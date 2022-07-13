package com.pickyprince.flashCard.lib;

import java.util.ArrayList;
import java.util.Scanner;

public class Home {
	private ArrayList<Button> buttonLists;

	public Home() {
		this.buttonLists = new ArrayList<Button>();
	}

	public boolean addButton(Button but) {
		if (buttonLists.add(but)) {
			System.out.println("button added successfully to the home screen!");
			return true;
		} else {
			System.out.println("Button addition failed");
			return false;
		}
	}

	public void printHome() {

		Scanner scanner = new Scanner(System.in);
		if (scanner == null) {
			System.out.println("loading scanner failed....");
		}else {
			System.out.println("scanner loaded!\n");
		}
		System.out.println("Home screen: ");
		if(buttonLists.size()==0) {
			System.out.println("\tNo buttons in Home screen yet!");
		}
		for (int i = 0; i < buttonLists.size(); i++) {
			System.out.println("\t" +i+" "+ buttonLists.get(i).toString());
		}
		boolean quit = false;
		Button newButton;
		int index;

		System.out.println("\n\n\tEnter 404 to quit...");
		while (!quit) {
			System.out.print("\n\tChoose button: ");
			index = scanner.nextInt();
			if (index < buttonLists.size() && index >= 0) {
				newButton = this.buttonLists.get(index);
				newButton.getOnClickListener().onClick();
				quit = true;
			} else if (index == 404) {
				System.out.println("\tProgram shutdowning...");
				quit = true;
			} else {
				System.out.println("\t\tThere is no "+index+" button!");
			}
		}
	}
}
