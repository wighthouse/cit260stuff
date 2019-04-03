package cit260stuff;

public class MainMenu extends Menu {
    
    /**
     * Default constructor.
     */
    public MainMenu() {
        super();
    }
    
    /**
     * Provide the menu title (or null to skip it)
     * @return
     */
    @Override
    protected String getTitle() {
        return "MAIN MENU";
    }
    
    
    /**
     * Provide a menu description, or null to skip it.
     * @return
     */
    @Override
    protected String getDescription() {
        return "This is the main menu of the program.";
    }
    
    /**
     * Provide the list of menu items.
     * @return
     */
    @Override
    protected MenuItem[] getMenuItems() {
        return new MenuItem[] {
                new MenuItem('1', "Adopt and Animal"),
                new MenuItem('2', "Surrender an Animal"),
                new MenuItem('3', "Quit"),
               
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
                System.out.println("You chose: Adopt a Pet");
                Menu adoptMenu = new AdoptMenu();
                adoptMenu.display();
                break;
            case '2':
                System.out.println("You typed 2");
                break;
            case '3':
                System.out.println("You typed 3");
                return false;
          
                
                
            default:
                System.out.println("Invalid Entry");
            
        }
        
        return true;
    }

}
