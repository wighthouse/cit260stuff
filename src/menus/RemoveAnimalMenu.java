package menus;

import java.util.List;

import menus.Menu;
import menus.MenuItem;
import cit260stuff.Animal;
import cit260stuff.ShelterDatabase;

public class RemoveAnimalMenu extends Menu {

	/**
	 * Default constructor. Does nothing.
	 */
	public RemoveAnimalMenu() {
		super();
	}

	/**
	 * Provide the menu title (or null to skip it)
	 * 
	 * @return
	 */
	@Override
	protected String getTitle() {
		return "Remove an Animal";
	}

	/**
	 * Provide a menu description, or null to skip it.
	 * 
	 * @return
	 */
	@Override
	protected String getDescription() {
		return null;
	}

	/**
	 * Provide the list of menu items.
	 * 
	 * @return
	 */
	@Override
	protected MenuItem[] getMenuItems() {
		return new MenuItem[] { new MenuItem('1', "Remove an animal from the shelter database"),
				new MenuItem('R', "Return") };
	}

	/**
	 * Handle the user's menu selection.
	 * 
	 * @param key
	 * @return false if the menu should exit and return to whatever called it.
	 */
	@Override
	protected boolean handleMenuSelection(char key) {

		switch (Character.toUpperCase(key)) {
		case '1':
			removeAnimal();
			break;
		case 'R':
			return false;

		default:
			System.out.println("Invalid Entry");

		}

		return true;
	}

	/**
	 * Allow the user to select from the list of animals which one to remove.
	 */
	private void removeAnimal() {
		// Print the list of animals
		List<Animal> animals = ShelterDatabase.getInventory();

		if (animals.size() == 0) {
			System.out.println("We currently have no animals in our shelter.");
			return;
		}

		for (int i = 0; i < animals.size(); i++) {
			System.out.printf("%d - %s%n", i + 1, animals.get(i).getDescription());
		}
		System.out.println();

		// prompt the user for the number of the animal to remove.
		String option = prompt("Enter the number of the animal to remove, or 'Q' to quit: ");
		if (option.equalsIgnoreCase("Q")) {
			return;
		}

		// Remove it.
		int index = -1;

		try {
			index = Integer.parseInt(option);
		} catch (NumberFormatException ex) {
			System.out.println("Your input was not recognized.");
		}

		if (index != -1) {
			animals.remove(index - 1);
			ShelterDatabase.storeInventory();
		}
	}

}
