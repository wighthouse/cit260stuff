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
        };
    }
    /**
     * Handle the user's menu selection.
     * @param key
     * @return false if the menu should exit and return to whatever called it.
     */
    @Override
    protected boolean handleMenuSelection(char key) {
        
        switch (Character.toUpperCase(key)) {
            case '1': 
                addDog();
                break;
            case '2':
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
     * Prompt for the animal's attributes. These are common to all animals
     * so we only need the base class referenced here.
     */
    private void getAnimalName(Animal animal) {
        String promptMessage = String.format(
            "Please enter the %s's name: ", 
            animal.getClass().getSimpleName());

        String name = prompt(promptMessage);
        animal.setName(name);
    	}
    private void getAnimalBreed(Animal animal) {
        String promptMessage = String.format(
            "Please enter the %s's breed: ", 
            animal.getClass().getSimpleName());

        String breed = prompt(promptMessage);
        animal.setBreed(breed);
    	}
    private void getAnimalSex(Animal animal) {
        String promptMessage = String.format(
            "Please enter the %s's sex: ", 
            animal.getClass().getSimpleName());

        String sex = prompt(promptMessage);
        animal.setBreed(sex);
    	}
    private void getAnimalSex(Animal animal) {
        String promptMessage = String.format(
            "Please enter the %s's sex: ", 
            animal.getClass().getSimpleName());

        String sex = prompt(promptMessage);
        animal.setBreed(sex);
    	}
    private void getAnimalSex(Animal animal) {
        String promptMessage = String.format(
            "Please enter the %s's sex: ", 
            animal.getClass().getSimpleName());

        String sex = prompt(promptMessage);
        animal.setBreed(sex);
    	}
    /**
     * Prompt the user for the new Dog's attributes and
     * add it to the ShelterDatabase.
     */
    private void addDog() {

        Dog newDog = new Dog();

        getAnimalName(newDog);

        String promptMessage = String.format(
            "Please enter the %s's favorite toy: ",
            Dog.class.getSimpleName());

        String toy = prompt(promptMessage);

        newDog.setFavoriteToy(toy);

        ZooDatabase.getZoo().add(newDog);
        ZooDatabase.storeZoo();
    }

    /**
     * Prompt the user for the new Cat's attributes and
     * add it to the ShelterDatabase.
     */
    private void addCat() {
        getAnimalName(animal);
        ZooDatabase.getZoo().add(animal);
        ZooDatabase.storeZoo();
    }
    
}
