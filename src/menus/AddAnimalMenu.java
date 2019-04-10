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
     * @return
     */
    @Override
    protected String getTitle() {
        return "ADD AN ANIMAL";
    }
    
    
    /**
     * Provide a menu description, or null to skip it.
     * @return
     */
    @Override
    protected String getDescription() {
        return "Please choose the type of animal you would like to add.";
    }
    
    /**
     * Provide the list of menu items.
     * @return
     */
    @Override
    protected MenuItem[] getMenuItems() {
        return new MenuItem[] {
                new MenuItem('1', "Add a Dog"),
                new MenuItem('2', "Add a Cat"),
                new MenuItem('R', "Return to Main Menu"),
                new MenuItem('Q', "Quit")
        };
    }
}
