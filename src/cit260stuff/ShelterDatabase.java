package cit260stuff;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ShelterDatabase {

private final static String FILENAME = "shelter.txt";
private static ArrayList<Animal> inventory = null;
    
/**
 * Return the shelter database array, loading it from a file, if necessary.
 * @return
 */
synchronized public static ArrayList<Animal> getInventory() {
    
    if (inventory == null) {
        loadInventory();
    }
    
    return inventory;
}   

	 /**
     * Write the inventory of shelter animals out to a file.
     * @param inventory
     */
    public static void storeInventory(ArrayList<Animal> inventory) {
        
        File textFile = new File(FILENAME);
        
        try (PrintWriter out = new PrintWriter(new FileOutputStream(textFile))) {
            
            
            for (Animal animal : inventory) {
                out.printf("Type: %s%n", animal.getClass().getSimpleName());
                out.printf("Breed: %s%n", animal.getBreed());
                out.printf("Sex: %s%n", animal.getSex());
                out.printf("Color: %s%n", animal.getColor());
                out.printf("AgeInYears: %s%n", animal.getAgeYears());
                out.printf("AgeInMonths: %s%n", animal.getAgeMonths());
                
                if (animal instanceof Cat) {
                    Cat cat = (Cat)animal;
					out.printf("Name: %s%n Litterbox Trained: %s%n", animal.getName(), cat.getIsLitterBoxTrained());
               
                    
                } else if (animal instanceof Dog) {
                    Dog dog = (Dog)animal;
                    out.printf("Name: %s%n", animal.getName());
                    out.printf("Gets Along with Dogs: %s%n", dog.getGetsAlongDogs());
                    
                }
            }
           
        
        } catch (FileNotFoundException exception) {
            System.err.println("Could not find file path");
            
        } 
        
    }
    /**
     * Load the shelter inventory file.
     * @return
     */
    public static ArrayList<Animal> loadInventory() {
        
        File textFile = new File(FILENAME);
        ArrayList<Animal> inventory = new ArrayList<>();
        
        try (Scanner scanner = new Scanner(textFile)) {
            
            scanner.useDelimiter(Pattern.compile("[:\\n]"));
            
            while (scanner.hasNext()) {
                String key = scanner.next();
                String value = scanner.next().trim();
                
                Animal animal = null;
                
                if (key.equals("Type")) {
                    
                    switch(value) {
                        case "Dog":
                            animal = readDog(scanner);
                            break;
                        case "Cat":
                            animal = readCat(scanner);
                            break; 
                        default:
                            break;
                    }
                }
                
                if (animal != null) {
                    inventory.add(animal);
                }
            }
        } catch (FileNotFoundException exception) {
            System.err.println("Could not find file path");
            
        } 
        
        return inventory;
    }
    /**
     * 
     * @param scanner
     * @return
     */
    private static Dog readDog(Scanner scanner) {
        
        String name = null;
        String breed = null;
        String sex = null;
        
        for (int i=0; i < 3; i++) {
            
            String key = scanner.next();
            
            if (key.equals("Name")) {
                name = scanner.next();
                
            } else if (key.equals("Breed")) {
                breed = scanner.next().trim();
            
            } else if (key.equals("Sex")) {
                sex = scanner.next().trim();
            }
        }
        
        if (name == null || breed == null || sex == null) {
            return null;
        }
        return null;
       // return new Dog(name, breed, sex); This will be generated as input in AddAnimal Menu 
        
    }
private static Cat readCat(Scanner scanner) {
        
        String name = null;
        String breed = null;
        String sex = null;
        
        for (int i=0; i < 3; i++) {
            
            String key = scanner.next();
            
            if (key.equals("Name")) {
                name = scanner.next();
                
            } else if (key.equals("Breed")) {
                breed = scanner.next().trim();
            
            } else if (key.equals("Sex")) {
                sex = scanner.next().trim();
            }
        }
        
        if (name == null || breed == null || sex == null) {
            return null;
        }
        return null;
       // return new Cat(name, breed, sex); This will be generated as input in AddAnimal Menu 
        
    }
}
