package menus;

public class MainMenu extends Menu {

	/**
	 * Default constructor.
	 */
	public MainMenu() {
		super();
	}

	/**
	 * Provide the menu title (or null to skip it)
	 * 
	 * @return
	 */
	@Override
	protected String getTitle() {
		return "MAIN MENU";
	}

	/**
	 * Provide a menu description, or null to skip it.
	 * 
	 * @return
	 */
	@Override
	protected String getDescription() {
		return "This is the main menu of the program.";
	}

	/**
	 * Provide the list of menu items.
	 * 
	 * @return
	 */
	@Override
	protected MenuItem[] getMenuItems() {
		return new MenuItem[] { new MenuItem('1', "Add an Animal"), new MenuItem('2', "Remove an Animal"),
				new MenuItem('3', "Display Current Inventory"), new MenuItem('4', "Quit")

		};
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
			System.out.println("You chose: Add an Animal");
			Menu addMenu = new AddAnimalMenu();
			addMenu.display();
			break;
		case '2':
			System.out.println("You chose: Remove an Animal");
			// Menu removeMenu = new RemoveAnimalMenu();//Why doesn't this work??
			// removeMenu.display();
			break;
		case '3':
			System.out.println("You chose: Display Current Inventory");
			// print inventory list
			break;
		case '4':
			return false;

		default:
			System.out.println("Invalid Entry");

		}

		return true;
	}

}
