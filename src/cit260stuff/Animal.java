package cit260stuff;

/**
 * create a parent class that contains the info that will be inherited by the
 * child classes
 * 
 * @author mariazubia
 *
 */

public class Animal {
	/** default values or data field-declare */
	private String name;
	private String species;
	private String breed;
	private String sex;
	private int ageYears;
	private int ageMonths;
	private String color;

	/** constructors */
	protected Animal() {
		name = " ";
		species = " ";
		breed = " ";
		sex = " ";
		ageYears = 0;
		ageMonths = 0;
		color = " ";

	}

	// args
	public Animal(String name, String species, String breed, String sex, int ageYears, int ageMonths, String color) {
		this.name = name;
		this.species = species;
		this.breed = breed;
		this.sex = sex;
		this.ageYears = ageYears;
		this.ageMonths = ageMonths;
		this.color = color;
	}

	// The setters

	/** a method to set the name */
	public void setName(String name) {
		this.name = name;
	}

	/** a method to set the species */
	public void setSpecies(String species) {
		this.species = species;
	}

	/** a method to set the breed */
	public void setBreed(String breed) {
		this.name = breed;
	}

	/** a method to set the sex */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/** a method to set ageYears */
	public void setageYears(int ageYears) {
		this.ageYears = ageYears;
	}

	/** a method to set ageMonths */
	public void setageMonths(int ageMonths) {
		this.ageMonths = ageMonths;
	}

	/** a method to set the color */
	public void setColor(String color) {
		this.color = color;
	}

//The getters 
	/** a method to return name */
	public String getName() {
		return name;
	}

	/** a method to return species */
	public String getSpecies() {
		return species;
	}

	/** a method to return breed */
	public String getBreed() {
		return breed;
	}

	/** a method to return sex */
	public String getSex() {
		return sex;
	}

	/** a method to return ageYears */
	public int getAgeYears() {
		return ageYears;
	}

	/** a method to return ageMonths */
	public int getAgeMonths() {
		return ageMonths;
	}

	/** a method to return color */
	public String getColor() {
		return color;
	}

	/**
	 * Return a printable description of the animal.
	 */
	public String getDescription() {
		return null;
	}

	/**
	 * Describe the Animal object.
	 */
	@Override
	public String toString() {
		return String.format("Animal { name: %s }", name);
	}

}
