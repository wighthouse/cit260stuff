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
	private static Animal animal = null;
	private static String name = null;
	private static String species = null;
	private static String breed = null;
	private static String sex = null;
	private static Integer ageYears = 0;
	private static Integer ageMonths = 0;
	private static String color = null;
	private static boolean getsAlongDogs = false;
	private static boolean isPottyTrained = false;

	/**
	 * Return the shelter database array, loading it from a file, if necessary.
	 * 
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
	 * 
	 * @param inventory
	 */
	public static void storeInventory() {

		File textFile = new File(FILENAME);

		try (PrintWriter out = new PrintWriter(new FileOutputStream(textFile))) {

			for (Animal animal : inventory) {

				out.printf("Type: %s%n", animal.getClass().getSimpleName());
				out.printf("Name: %s%n", animal.getName());
				out.printf("Breed: %s%n", animal.getBreed());
				out.printf("Sex: %s%n", animal.getSex());
				out.printf("Color: %s%n", animal.getColor());
				out.printf("AgeInYears: %s%n", animal.getAgeYears());
				out.printf("AgeInMonths: %s%n", animal.getAgeMonths());

				if (animal instanceof Cat) {
					Cat cat = (Cat) animal;
					out.printf("Litterbox Trained: %s%n", cat.getIsLitterBoxTrained());
					out.printf("IsDeclawed: %s%n", cat.getIsDeclawed());

				} else if (animal instanceof Dog) {
					Dog dog = (Dog) animal;
					out.printf("Gets Along with Dogs: %s%n", dog.getGetsAlongDogs());
					out.printf("IsPottyTrained: %s%n", dog.getIsPottyTrained());

				}
			}

		} catch (FileNotFoundException exception) {
			System.err.println("Could not find file path");

		}

	}

	/**
	 * Load the shelter inventory file.
	 * 
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

				//Animal animal = null;

				if (key.equals("Type")) {

					switch (value) {
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
	private static void readAnimalStuff(Animal animal, Scanner scanner) {

		/*String name = null;
		String species = null;
		String breed = null;
		String sex = null;
		Integer ageYears = 0;
		Integer ageMonths = 0;
		String color = null;
		boolean getsAlongDogs = false;
		boolean isPottyTrained = false;
*/
		for (int i = 0; i < 7; i++) {

			String key = scanner.next();

			if (key.equals("Name")) {
				name = scanner.next();

			} else if (key.equals("Breed")) {
				breed = scanner.next().trim();

			} else if (key.equals("Sex")) {
				sex = scanner.next().trim();

			} else if (key.equals("Species")) {
				species = scanner.next().trim();

			} else if (key.equals("Color")) {
				color = scanner.next().trim();

			} else if (key.equals("AgeYears")) {
				ageYears = Integer.parseInt(scanner.next().trim());
			}

		}
	}

	private static Dog readDog(Scanner scanner) {

		readAnimalStuff(animal, scanner);

		boolean getsAlongDogs = false;
		boolean isPottyTrained = false;

		String key = scanner.next();
		for (int i = 0; i < 2; i++) {

			if (key.equals("GetsAlongDogs")) {
				String getsAlong = scanner.next().trim();
				getsAlongDogs = Boolean.valueOf(getsAlong);

			} else if (key.equals("IsPottyTrained")) {
				String pottyTrained = scanner.next().trim();
				isPottyTrained = Boolean.valueOf(pottyTrained);

			}
		}
		return new Dog(name, species, breed, sex, ageYears, ageMonths, color, getsAlongDogs, isPottyTrained);
	}

	private static Cat readCat(Scanner scanner) {

		String name = null;
		String breed = null;
		String sex = null;

		for (int i = 0; i < 3; i++) {

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
		// return new Cat(name, breed, sex); This will be generated as input in
		// AddAnimal Menu

	}
}
