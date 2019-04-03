import java.util.Scanner;

/**
 * Menu base class to provide the structure for all the other menus
  */
public class Menu {
    
    
    private static Scanner scanner;
    
    // initialize the scanner
    static {
        scanner = new Scanner(System.in);
    }
    
    /**
     * default constructor
     */
    protected Menu() {
        
    }
    
    /**
     * Provide the menu title. 
     * @return null until another class provides a title.
     */
    protected String getTitle() {
        return null;
    }
    
    
    /**
     * Provide the menu description. 
     * @return null unless displaying a description.
     */
    protected String getDescription() {
        return null;
    }
    
    /**
     * Provide the list of menu items. 
     * @return
     */
    protected MenuItem[] getMenuItems() {
        return new MenuItem[] {};
    }
    
    
    /**
     * Handle the user's menu selection.
     * @param key
     * @return false if the menu should exit and return to whatever called it.
     */
    protected boolean handleMenuSelection(char key) {
        return false;
    }
    
    
    /**
     * The menu loop. When this method ends, the 
     * menu is closed and returns to whatever called
     * it.
     */
    public void display() {
        
        boolean keepGoing = true;
        
        while (keepGoing == true) {
            // print the title
            String title = getTitle();
            if (title != null) {
                System.out.println( title );
                System.out.println();
            }
            
            // print the description
            String description = getDescription();
            if (description != null) {
                System.out.println( description );
                System.out.println();
            }
            
            // print the menu items
            MenuItem[] menuItems = getMenuItems();
            if (menuItems == null) {
                System.out.println("Uh-oh! I seemed to have misplaced the menu items!");
                break;
            }
            
            for (MenuItem item : menuItems) {
                System.out.printf("%c - %s%n", item.getKey(), item.getText());
            }
            
            System.out.println();
            
            // prompt the user and get the menu choice
            String userInput = prompt("Your choice: ");
            
            System.out.println();
            
            // process the menu choice.
            if (userInput != null && userInput.length() > 0) {
                keepGoing = handleMenuSelection(userInput.charAt(0));
            }
            
            System.out.println();
        }
    }
    
    
    /**
     * Prompt the user for input, and return whatever they type. The user
     * must hit Enter before this will return the value.
     * @param message
     * @return The user's typed value.
     */
    public static String prompt(String message) {
        
        System.out.print(message);
        String input = scanner.nextLine();
        return input.trim();
    }
    
    
    /**
     * Pause the program for the specified number of milliseconds.
     * @param milliseconds
     */
    public static void delay(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (Exception e) {
            // do nothing
        }
    }

}
