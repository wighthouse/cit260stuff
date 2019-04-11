package menus;

import cit260stuff.ShelterDatabase;
import cit260stuff.Animal;
import cit260stuff.Dog;
import cit260stuff.Cat;

public class AddAnimalMenu extends Menu {

	/**
	 * Default constructor. Does nothing.
	 */
	public AddAnimalMenu() {
		super();
	}

	/**
	 * Provide the menu title (or null to skip it)
	 * 
	 * @return
	 */
	@Override
	protected String getTitle() {
		return "Add an Animal";
	}

	/**
	 * Provide a menu description, or null to skip it.
	 * 
	 * @return
	 */
	@Override
	protected String getDescription() {
		return "Please choose the type of animal you would like to add.";
	}

	/**
	 * Provide the list of menu items.
	 * 
	 * @return
	 */
	@Override
	protected MenuItem[] getMenuItems() {
		return new MenuItem[] { new MenuItem('1', "Add a Dog"), new MenuItem('2', "Add a Cat"),
				new MenuItem('R', "Return to Main Menu"), };
	}

	/**
	 * Handle the user's menu selection.
	 * 
	 * @param key
	 * @return false if the menu should exit and return to whatever called it.
	 */
	@Override
	protected boolean handleMenuSelection(char key) {
		Animal animal = null;
		switch (Character.toUpperCase(key)) {
		case '1':
			animal = new Dog();
			addDog();
			break;
		case '2':
			animal = new Cat();
			addCat();
			break;
		case 'R':
			return false;

		default:
			System.out.println("Invalid Entry");

		}

		return true;
	}

	/**
	 * Prompt for the animal's attributes. These are common to all animals so we
	 * only need the base class referenced here.
	 */
	private void getAnimalStuff(Animal animal) {

		String promptMessage = String.format("Please enter the %s's name: ", animal.getClass().getSimpleName());

		String name = prompt(promptMessage);
		animal.setName(name);

		promptMessage = String.format("Please enter the %s's breed: ", animal.getClass().getSimpleName());

		String breed = prompt(promptMessage);
		animal.setBreed(breed);
	
		promptMessage = String.format("Please enter the %s's sex: ", animal.getClass().getSimpleName());

		String sex = prompt(promptMessage);
		animal.setSex(sex);
	
		promptMessage = String.format("Please enter the %s's color: ", animal.getClass().getSimpleName());

		String color = prompt(promptMessage);
		animal.setColor(color);
	
		promptMessage = String.format("Please enter the %s's age in years: ", animal.getClass().getSimpleName());

		String ageYrs = prompt(promptMessage);
		Integer ageYears = Integer.parseInt("ageYrs");
		animal.setageYears(ageYears);
	
		promptMessage = String.format("Please enter the %s's age in months: ",
				animal.getClass().getSimpleName());

		String ageMnth = prompt(promptMessage);
		Integer ageMonths = Integer.parseInt("ageMnth");
		animal.setageMonths(ageMonths);
	}

	/**
	 * Prompt the user for the new Dog's attributes and add it to the
	 * ShelterDatabase.
	 */
	private void addDog() {

		Dog newDog = new Dog();

		getAnimalStuff(newDog);

		String promptMessage = String.format("Does the %s get along with other dogs? (True or False): ",
				Dog.class.getSimpleName());

		String getsAlong = prompt(promptMessage);
		boolean getsAlongDogs = Boolean.valueOf(getsAlong);
		newDog.setGetsAlongDogs(getsAlongDogs);

		ShelterDatabase.getInventory().add(newDog);
		ShelterDatabase.storeInventory();
	}

	/**
	 * Prompt the user for the new Cat's attributes and add it to the
	 * ShelterDatabase.
	 */
	private void addCat() {
		Cat newCat = new Cat();

		getAnimalStuff(newCat);

		String promptMessage = String.format("Is the %s declawed? (True or False): ", Cat.class.getSimpleName());

		String claws = prompt(promptMessage);
		boolean isDeclawed = Boolean.valueOf(claws);
		newCat.setIsDeclawed(isDeclawed);

		ShelterDatabase.getInventory().add(newCat);
		ShelterDatabase.storeInventory();
	}

}
