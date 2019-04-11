package menus;

import java.util.List;

import menus.Menu;
import menus.MenuItem;
import cit260stuff.Animal;
import cit260stuff.Cat;
import cit260stuff.Dog;
import cit260stuff.ShelterDatabase;

public class PrintAnimalsMenu extends Menu {

	/**
	 * Default constructor. Does nothing.
	 */
	public PrintAnimalsMenu() {
		super();
	}

	/**
	 * Provide the menu title (or null to skip it)
	 * 
	 * @return
	 */
	@Override
	protected String getTitle() {
		return "Print animals";
	}

	/**
	 * Provide a menu description, or null to skip it.
	 * 
	 * @return
	 */
	@Override
	protected String getDescription() {
		return "Welcome to the Animal Shelter Database";
	}

	/**
	 * Provide the list of menu items.
	 * 
	 * @return
	 */
	@Override
	protected MenuItem[] getMenuItems() {
		return new MenuItem[] { new MenuItem('1', "See all the animals"), new MenuItem('2', "See the Dogs"),
				new MenuItem('3', "See the Cats"), new MenuItem('R', "Return") };
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
			printAnimals(Animal.class);
			break;
		case '2':
			printAnimals(Dog.class);
			break;
		case '3':
			printAnimals(Cat.class);
			break;
		case 'R':
			return false;

		default:
			System.out.println("Invalid Entry");

		}

		return true;
	}

	/**
	 * Print out all animals in the database that match the specified animalClass.
	 * 
	 * @param animalClass
	 */
	private void printAnimals(Class animalClass) {

		boolean somethingPrinted = false;

		for (Animal animal : ShelterDatabase.getInventory()) {
			if (animalClass.isInstance(animal)) {
				System.out.println(animal.getDescription());
				somethingPrinted = true;
			}
		}

		if (somethingPrinted == false) {
			System.out.printf("We don't currently have any %ss.%n", animalClass.getSimpleName());
		}
	}
}
