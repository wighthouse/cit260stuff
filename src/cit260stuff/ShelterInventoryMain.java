package cit260stuff;

import menus.Menu;
import menus.MainMenu;

public class ShelterInventoryMain {

	public static void main(String[] args) {

		// create the MainMenu object
		Menu mainMenu = new MainMenu();
		
		// display it (when it returns, the program will end.)
		mainMenu.display();
		
		// Say thank you, and exit
		System.out.println();
        System.out.println("Thank you!");
	}


}
